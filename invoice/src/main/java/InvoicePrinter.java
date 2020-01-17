//Class which prints all data
class InvoicePrinter
{
    void invoicePrinter()
    {
        InvoicePureFabricationExtractData ipf = new InvoicePureFabricationExtractData();
        System.out.println("\n\n\n\n\n\nINVOICE VAT\n"+"DT/27/10/19\n"+"\t\t\t\tPlace and date: Wroclaw, 2019-10-27\n"+
                "\t\t\t\tSale date: 2019-10-27\n\n"+"Dealer\t\t\t\t"+"Buyer\n"+"VM\t\t\t\t"+ ipf.getBuyerName()+"\n"+
                "Grunwald.24\t\t\t"+ipf.getAddress()+"\n"+"01-012 Wroclaw\t\t\t"+ipf.getIndex()+"\n"+
                "NIP: 102010\t\t\t"+"NIP:"+ipf.getNip()+"\n\n"+"№ "+"Product "+"Count "+"Price "+"Net Value "+"VAT  "+
                "Tax Value  "+"Gross Value\n"+ipf.getText()+"\n"+"\t\t\t\tTo Pay: "+ipf.getToPay()+"\n\n\n\n");
    }
}
