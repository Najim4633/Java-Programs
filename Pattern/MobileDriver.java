class OperatingSystem{
    String name;
    String version;
    double memory;
    String releaseDate;
    public OperatingSystem(String name, String version, double memory, String releaseDate) 
    {
        super();
        this.name = name;
        this.version= version;
        this.memory = memory;
        this.releaseDate = releaseDate;
    }
    public void displayOs()
    {
        System.out.println("\n---------------------------OPERATING SYSTEM------------------------");
        System.out.println("os name: "+ name);
        System.out.println("Os version: "+ version);
        System.out.println("Os memory: "+ memory);
        System.out.println("os relese Date: "+ releaseDate);
    }
}

class Battery
{
    int capacity;
    String brand;
    String type;
    String manufactureDate;
    String warrenty;
    double power;

    public Battery(int capacity, String brand, String type, String manufactureDate, String warrenty, double power)
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
class Processor
{
    String type;
    double clockSpeed;
    int ram;
    int rom;

    public Processor(String type,double clockSpeed,int ram, int rom)
    {
        super();
        this.type=type;
        this.clockSpeed=clockSpeed;
        this.ram=ram;
        this.rom=rom;
    }
    public void displayProcessor()
    {
        System.out.println("\n-----------------------PROCCESOR----------------------------");
        System.out.println("type : "+type);
        System.out.println("clock Speed : "+clockSpeed);
        System.out.println("ram : "+ram);
        System.out.println("rom : "+rom);
    }
}

class Mobile{
    String brand;
    String model;
    String color;
    double camera;
    double price;
    Battery battery;
    OperatingSystem os;
    Processor processor = new Processor("quadcore",8, 8, 128);
    public Mobile(String brand, String model, String color, double camera, double price, Battery battery)
    {
        super();
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.camera=camera;
        this.price=price;
        this.battery=battery;
        this.os=new OperatingSystem("Android", "14.2.1", 4, "18 may 2024");
    }
    public void displayMobile()
    {
        System.out.println("\n---------------------------------------------------");
        System.out.println("brand: "+brand);
        System.out.println("model : "+model);
        System.out.println("color : "+ color);
        System.out.println("camera : "+camera );
        System.out.println("price: "+price);
    }
}
public class MobileDriver {
    public static void main(String[] args) {
        Battery battery= new Battery(5000, "samsung", "Lion", "12 may 2021", "1 year", 48);
        Mobile mb= new Mobile("samsung","s24 ultra","black",108,124000,battery);

        mb.displayMobile();
        mb.battery.displayBattery();;
        mb.os.displayOs();
        mb.processor.displayProcessor();
        
    }
    
}
