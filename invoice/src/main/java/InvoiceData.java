//Class which save and manipulate with all data
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class InvoiceData extends InvoicePrinter
{
    private final Scanner s = new Scanner(System.in);
    private static int count;
    static String buyerName;
    static String address;
    static String index;
    static String nip;
    static String text;
//    List<String> productList = new ArrayList<>();
    static double toPay = 0;
    void scanner()
    {
//        productList.add("Apple");
//        productList.add("Water");
//        productList.add("Sweets");
//        StringBuilder builder = new StringBuilder();
//        for (String value : productList)
//        {
//            builder.append(value);
//        }
//        text = builder.toString();
//        System.out.println(text);
//        switch(pL)
//        {
//
//        }
        DecimalFormat df = new DecimalFormat("#.##");
        char space = ' ';
        System.out.println("Enter your name please: ");
        buyerName = s.nextLine();
        System.out.println("Enter your address: ");
        address = s.nextLine();
        System.out.println("Enter your index and city: ");
        index = s.nextLine();
        System.out.println("Enter your NIP: ");
        nip = s.nextLine();
        System.out.println("Enter amount of unique purchases: ");
        String unknown = s.nextLine();
        try
        {
            List<String> listOfStrings = new LinkedList<>();
            int num = Integer.parseInt(unknown);
            for(int i=0; i<num; i++)
            {
                //Product iterator(Counts amount of positions)
                count++;

                //Product title
                System.out.println("Enter product you want to purchase: ");
                String product = s.nextLine();
                for(int j = product.length(); j<8; j++)
                {
                    product+=space;
                }

                //Amount of product
                System.out.println("Enter amount of this product: ");
                String amountProducts = s.nextLine();
                int amountProductsInt = Integer.parseInt(amountProducts);
                for(int j=amountProducts.length(); j<6; j++)
                {
                   amountProducts+=space;
                }

                //Product price
                System.out.println("Enter price of this product: ");
                String price = s.nextLine();
                double priceDouble = Double.parseDouble(price);
                for(int j=price.length(); j<6; j++)
                {
                    price+=space;
                }

                //Net Value
                double netValue = priceDouble*amountProductsInt;
                String netV = df.format(netValue);
                for(int j=netV.length(); j<9; j++)
                {
                    netV+=space;
                }

                //VAT(Tax Value)
                double taxValue = priceDouble*amountProductsInt*1.12-priceDouble*amountProductsInt;
                String taxV = df.format(taxValue);
                for(int j=taxV.length(); j<11; j++)
                {
                    taxV+=space;
                }

                //Gross Value
                double grossValue = priceDouble*amountProductsInt*1.12;
                String grossV = df.format(grossValue);
                for(int j=grossV.length(); j<11; j++)
                {
                    grossV+=space;
                }

                toPay += grossValue;
                String string = count+" "+ product +amountProducts+price+netV+" 12%  "+taxV+grossV+"\n";
                listOfStrings.add(string);
            }
            StringBuilder builder = new StringBuilder();
            for (String value : listOfStrings)
            {
                builder.append(value);
            }
            text = builder.toString();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter correct number");
        }
    }
    public static void main(String [] args)
    {
        InvoiceData id = new InvoiceData();
        id.scanner();
        InvoicePrinter ip = new InvoicePrinter();
        ip.invoicePrinter();
    }
}
