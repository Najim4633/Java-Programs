class Mobile
{
    private String brand;
    private String model;
    private String color;
    private double price;
    private Processor processor;
    private Battery battery =new Battery ("4500 mah","samsung ","lion","19/04/2025","2year",7);
    private SimCard [] simcard = new SimCard[2];
    private Charger charger;
    private HeadPhone headPhone;
    private int indx;


    public Mobile(String brand, String model, double price , String color, Processor processor)
    {
        this.brand=brand;
        this.model=model;
        this.price = price;
        this.color =color;
        this.processor=processor;
    }

    public void displayMobile()
    {
        System.out.println("----------------------------------Mobile----------------------------- \n brand: "+brand +"\n model : "+model +"\n price : "+price + "\n color "+ color);
    }
    public Processor getProcessor()
    {
        return processor;
    }
    public Battery getBattery()
    {
        return battery;
    }
    public SimCard[] getSimCard()
    {
        return simcard;
    }
    public HeadPhone getHeadPhone()
    {
        return headPhone;
    }
    public Charger getCharger()
    {
        return charger;
    }
    public void addSimCard(String serviceProvider, String networkType, String type,long number  )
    {
        if(indx<2){
         SimCard simcard =new SimCard(serviceProvider,networkType,type,number);
         this.simcard[indx]=simcard;
         indx++;
        }
        else{
            System.out.println("cant add another simcard");
        }
    }

    public void addHeadPhone(String brand, String type, int volume, int price) {
        headPhone = new HeadPhone(brand,type,volume,price);
    }
    public void addCharger(String type ,int power , String brand )
    {
        charger = new Charger(type,power, brand);
    }

}
class Processor{
    private String type;
    private double clockSpeed;
    private String networkType;
    private int ram;
    private int rom;
    private OperatingSystem os;
    public Processor( String type,    double clockSpeed,    String networkType,    int ram,    int rom)
    {
        this.type=type;
        this.clockSpeed = clockSpeed;
        this.networkType =networkType;
        this.ram =ram;
        this.rom =rom;
        this.os= new OperatingSystem("Android", "15.12", 8, "19/03/2025");
    }
    public void displayProcessor()
    {
        System.out.println("\n ----------------------Processr------------------------\n  type: "+type+"\n ClockSpeed : "+clockSpeed+ "\n networkType: "+networkType + "\n ram : "+ram +"\n rom : "+rom);
    }
    public OperatingSystem getOs()
    {
        return os;
    }

}
class Battery
{
    String capacity;
    String brand;
    String type;
    String manufactureDate;
    String warrenty;
    double power;

    public Battery(String capacity, String brand, String type, String manufactureDate, String warrenty, double power)
    {
        super();
        this.capacity=capacity;
        this.brand = brand;
        this.type=type;
        this.manufactureDate=manufactureDate;
        this.warrenty=warrenty;
        this.power= power;
    }
    public void displayBattery()
    {
        System.out.println("\n------------------------BATTERY---------------------------");
        System.out.println("capacity : "+ capacity);
        System.out.println("brand : "+ brand );
        System.out.println("type  : "+ type);
        System.out.println("manufacture date : "+manufactureDate );
        System.out.println("warrenty : "+warrenty );
        System.out.println("power : "+power );
    }
}

class SimCard{

    private long number;
    private String type;
    private String networkType;
    private String serviceProvider;

    public SimCard(String serviceProvider, String networkType, String type, long number) {
        super();
        this.serviceProvider =serviceProvider;
        this.networkType=networkType;
        this.type =type;
        this.number= number;
    }

    public void displaySimCard()
    {
        System.out.println("--------------------------SIMCARD-------------------------------\n Service Provide : "+serviceProvider+"\n Network Type "+networkType+"type  "+type+"\n Number : "+number );
    }
}
class HeadPhone{
    String brand; String type; int volume; int price;

    public HeadPhone(String brand, String type, int volume, int price) {
        this.brand=brand;
        this.type=type;
        this.volume=volume;
        this.price=price;
    }

    public void displayHeadPhones() {
 System.out.println("\n-------------- Headphone---------- \n Brand : "+brand+"\n Type : "+type+"\n volume : " +volume+"\n Price "+price) ;
    }

}
class Charger{

    String type;
    int power;
    String brand;
    public Charger(String type, int power, String brand)
    {
        this.type =type;
        this.brand=brand;
        this.power= power;
    }
    public void displayCharger() {
       System.out.println("\n ----------------------------charger---------------------- \n type  "+type+"\nbarnd:  "+brand+"\n power  "+power);
    }
}
public class HasARelationship {
    public static void main(String[] args) {

Processor processor = new Processor("Dual Core", 2.5, "6G", 12,512);

Mobile mobile = new Mobile("SAMSUNG", "523", 70000, "WHITE", processor);
mobile.displayMobile();
mobile.getProcessor().displayProcessor(); // method chaining
mobile.getProcessor().getOs().displayOs();

mobile.getBattery().displayBattery();

mobile.addSimCard("VI", "56", "PRE PAID", 9876410125l);

mobile.addSimCard("AIRTEL", "5G", "PRE PAID", 9876440118l);


mobile.addCharger("TYPE-C",65, "SAMSUNG");

mobile.getCharger().displayCharger();


for (SimCard ele : mobile.getSimCard()){
ele.displaySimCard();
}
mobile.addHeadPhone ("BOAT", "BUDS", 10,1200);
mobile.addHeadPhone ("BOlT", "wired", 10,1500);

mobile.getHeadPhone().displayHeadPhones();

        
    }
    
}
