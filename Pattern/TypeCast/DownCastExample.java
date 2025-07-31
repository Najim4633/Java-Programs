import java.util.Scanner;

class User
{
    private String username;
    private String address;
    private String pass;

    User(String username, String address, String pass)
    {
        super();
        this.username=username;
        this.address=address;
        this.pass=pass;

    }
    public void getUserDetail()
    {
        System.out.println("username : "+this.username);
        System.out.println("Address : "+ this.address);
    }
}

class Payment extends User
{
    Payment(String username, String address, String pass)
    {
        super(username,address,pass);
    }
    public void paymentMode(/*Payment obj*/)
    {
        System.out.println("Payment Mode Selection");
        if(this instanceof PhonePay){
            System.out.println("PhonePay");
            PhonePay obj1=(PhonePay)this;
            this.getUserDetail();
            obj1.modeOfPayment();
        }
        else if (this instanceof GPay){
            System.out.println("GPay");
            this.getUserDetail();
            GPay obj1 = (GPay)this;
            obj1.modeOfPayment();
        }
        else{
                System.out.println("Paytm");
                this.getUserDetail();
                Paytm obj1 = (Paytm)this;
                obj1.modeOfPayment();
            }
        }
    }
class PhonePay extends Payment{
    PhonePay(String username, String address, String pass)
    {
        super(username,address,pass);
    }

    public void modeOfPayment() {
        System.out.println("'modeOfPayment' : Phonepay");
    }
}
class GPay extends Payment{
    GPay(String username, String address, String pass)
    {
        super(username,address,pass);
    }

    public void modeOfPayment() {
        System.out.println("'modeOfPayment' : Gpay");
    }
}
class Paytm extends Payment{
    Paytm(String username, String address, String pass)
    {
        super(username,address,pass);
       
    }

    public void modeOfPayment() {
        System.out.println("'modeOfPayment' : Paytm");
    }
}

public class DownCastExample {
    public static void main(String[] args) {
        Payment obj ;
        System.out.println("WELCOME TO PAYMENT GATEWAY");

        System.out.println("1. GooglePay");
        System.out.println("2. PhonePay");
        System.out.println("3. Paytm");
        System.out.println("4. COD");
        System.out.println();
        System.out.println("Enter an Option ");
        int opt= new Scanner(System.in).nextInt();

        switch(opt)
        {
            case 1 :{
                obj = new GPay("Ramesh", "pune", "ramesh@123");
              obj.paymentMode();
              break;
            }
            case 2 :{
                obj = new PhonePay("Ramesh", "pune", "ramesh@123");
              obj.paymentMode();
              break;
            }
            case 3 :{
                obj = new Paytm("Ramesh", "pune", "ramesh@123");
              obj.paymentMode();
              break;
            }
            case 4: {
                System.out.println("get your cash ready ");
                break;

            }
            default: {
                System.out.println("invalid input selected");
            }
            

        }
    }
    
}
