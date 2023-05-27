public class Instrument{
    private static int instrumentId;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPANNo;    
    public Instrument(String instrumentName){
        instrumentId+=1;
        this.customerName="";
        this.customerMobileNumber="";
        this.customerPANNo=0;
        this.instrumentName=instrumentName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setInstrumentName(String instrumentName){
        this.instrumentName=instrumentName;
    }
    public void setCustomerMobileNumber(String customerMobileNumber){
        this.customerMobileNumber=customerMobileNumber;
    }
    public void setCustomerPANNo(int customerPANno){
        this.customerPANNo=customerPANno;
    }
    public int getInstrumentId(){
        return instrumentId;
    }
    public String getInstrumentName(){
        return this.instrumentName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerMobileNumber(){
        return this.customerMobileNumber;
    }
    public int getCustomerPANNo(){ 
        return this.customerPANNo;
    }
    public void display(){
        System.out.println("The Instrument Id is "+ instrumentId+ " and the name of Instrument is " + this.instrumentName);
        if(!customerName.equals(" ") && !customerMobileNumber.equals(" ") && customerPANNo!=(0)){
            System.out.println("Customer Name: "+ this.customerName);
            System.out.println("Mobile Number: "+ this.customerMobileNumber);
            System.out.println("CustomerPANNo: "+ this.customerPANNo);
        }
    }
    public static void main(String[] args) {
        Instrument obj=new Instrument("Guitar");
        obj.setCustomerName("Jeeban");
        obj.setCustomerMobileNumber("9807099754");
        obj.setCustomerPANNo(2);
        obj.display();
    }
}