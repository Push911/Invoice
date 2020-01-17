//Class which extracts data
import java.text.DecimalFormat;

class InvoicePureFabricationExtractData extends InvoiceData
{
    String getBuyerName()
    {
        return buyerName;
    }
    String getAddress()
    {
        return address;
    }
    String getIndex()
    {
        return index;
    }
    String getNip()
    {
        return nip;
    }
    String getText()
    {
        return text;
    }
    double getToPay()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(toPay);
        return toPay;
    }
}
