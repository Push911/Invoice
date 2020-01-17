//Class which extracts data with Pure Fabrication method
import java.text.DecimalFormat;

class InvoicePureFabricationExtractData extends InvoiceData
{
    //Pure Fabrication
    public String getBuyerName()
    {
        return buyerName;
    }
    public String getAddress()
    {
        return address;
    }
    public String getIndex()
    {
        return index;
    }
    public String getNip()
    {
        return nip;
    }
    public String getText()
    {
        return text;
    }
    double getToPay()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(toPay);
        System.out.println(toPay);
        return toPay;
    }
}
