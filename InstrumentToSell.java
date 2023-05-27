public class InstrumentToSell extends Instrument{
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;
    public InstrumentToSell(String instrumentName,int price){
        super(instrumentName);
        this.price=price;
        this.sellDate="";
        this.discountPercent=0;
        this.isSold=false;
    }
    public void setprice(int price){
        if(isSold==false){
            this.price=price;
        }
        else{
            System.out.println("The instrument is already sold");
        }
    }
    public void setSellDate(String sellDate){
        this.sellDate=sellDate;
    }
    public void setdiscountpercent(int discountPercent){
        this.discountPercent=discountPercent;
    }
    public void setIsSold(boolean isSold){
        this.isSold=isSold;
    }
    public int getprice(){
        return this.price;
    }
    public String getSellDate(){
        return this.sellDate;
    }
    public int getDiscountPercent(){
        return this.discountPercent;
    }
    public boolean getIssold(){
        return this.isSold;
    }
    public void sellInstrument(String customerName, String customerMobileNumber, int customerPANNo, String sellDate, int discountPercent)
    {
        if(isSold==true){
            System.out.println("The Instrument is sold to"+ customerName + getCustomerName());
            System.out.println("Contact number: "+customerMobileNumber + getCustomerMobileNumber());
            System.out.println("Customer PANNo number: "+customerPANNo + getCustomerPANNo());
        }
        else{
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPANNo(customerPANNo);
            this.sellDate=sellDate;
            this.discountPercent=discountPercent;
            this.isSold=true;
            this.price=price-(price*discountPercent/100);
        }
    }
    public void display(){
        super.display();
        System.out.println("The price of the instrumet is "+this.price);
        if(isSold==true){
            System.out.println("The instrument is sold to "+super.getCustomerName()+" on "+this.sellDate);
    
        }
    }
    public static void main(String[] args) {
        InstrumentToSell obj=new InstrumentToSell("Guitar",11000);
        obj.sellInstrument("Jeeban" ,"9807099754" ,3,"Feb 16", 13);
        obj.display();
    }

}
