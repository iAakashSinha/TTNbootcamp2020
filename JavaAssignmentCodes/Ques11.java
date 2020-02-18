//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateo
// finterest etc,print details of every banks


public class Ques11 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        //getdetail of SBI bank
        sbi.getDetails();

        //getdetail of BOI bank
        boi.getDetails();

        //getdetail of icici bank
        icici.getDetails();
    }

}


abstract class Bank{

    protected String bankname ;
    protected int bankid;
    protected double rateofinterest;

    public void getDetails(){
        System.out.println("Bank Name : " + bankname);
        System.out.println("Bank Id : "+bankid);
        System.out.println("Rate of Interest : "+ rateofinterest);
    }
}

class SBI extends Bank{

    public SBI(){
        bankid=001;
        bankname="State Bank Of India";
        rateofinterest=3.4;
    }
}

class BOI extends Bank{

    public BOI(){
        bankid=002;
        bankname="Bank Of India";
        rateofinterest=4;
    }
}
class ICICI extends Bank{

    public ICICI(){
        bankid=003;
        bankname="ICICI";
        rateofinterest=4.5;
    }
}
