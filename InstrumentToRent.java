public class InstrumentToRent extends Instrument {
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    public InstrumentToRent(String instrumentName, int chargePerDay){
        super(instrumentName);
        this.chargePerDay=chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
    }
    public void setChargePerDay(int chargePerDay){
        this.chargePerDay=chargePerDay;
    }
    public void setDateOfRent(String dateOfRent){
        this.dateOfRent=dateOfRent;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays=noOfDays;
    }
    public void setIsRented(boolean isRented){
        this.isRented=isRented;
    }
    public void setDateOfReturn(String dateOfReturn){
        this.dateOfReturn=dateOfReturn;
    }
    public int getChargePerDay(){
        return this.chargePerDay;
    }
    public String getDateOfRent(){
        return this.dateOfRent;
    }
    public int getNoOfDays(){
        return this.noOfDays;
    }
    public boolean getIsRented(){
        return this.isRented;
    }
    public String getDateOfReturn(){
        return this.dateOfReturn;
    }
    public void rent(String customerName,String customerMobileNumber,int customerPANNo, String rentedDate,String returnedDate,int noOfRentedDays){
        if(isRented==true){
            System.out.println("The Instrument is Already Rented by "+ super.getCustomerName()+ " and will return it to on "+ getDateOfReturn());
            System.out.println("Contact Number: "+ super.getCustomerMobileNumber());
        }
        else{
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPANNo(customerPANNo);
            this.dateOfRent=rentedDate;
            this.dateOfReturn=returnedDate;
            this.noOfDays=noOfRentedDays;
            this.isRented=true;
            System.out.println("Instrument Rented Sucessfully");
            System.out.println("Rented By: "+ customerName);
            System.out.println("Mobile NUmber: "+ customerMobileNumber);
            System.out.println("Date of Renting: "+ rentedDate);
            System.out.println("Return Date: "+ returnedDate);
            System.out.println("No Of Days: "+ noOfRentedDays);
            System.out.println("Total charge: "+ chargePerDay*noOfRentedDays);
        }
    }
    public void returnInstrument(){
        if(isRented==false){
            System.out.println("The Instrument is not rented.");
        }
        else{
            this.setCustomerName("");
            this.setCustomerMobileNumber("");
            this.setCustomerPANNo(0);
           this.setDateOfReturn("");
            this.setDateOfRent("");
            this.setNoOfDays(0);
            this.setIsRented(false);
        }
    }
    public void display(){
        super.display();
        if(isRented==true){ 
            System.out.println("Instrument is already rented");
            System.out.println("Rented By: "+super.getCustomerName());
            System.out.println("Contact: "+ super.getCustomerMobileNumber());
            System.out.println("Rented date: "+ getDateOfRent());
            System.out.println("Will return on: "+ getDateOfReturn());
        }
    }
    public static void main(String[] args) {
        InstrumentToRent obj=new InstrumentToRent("Guitar",2000);
        obj.rent("Ripesh","9825303777",25,"Aug 5","Aug 10",5);
        obj.returnInstrument();
        obj.display();
    }
}
