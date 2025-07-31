public class Driver {
    Driver()
    {
        super();
        System.out.println("base");
    }
    Driver(int a)
    {
        this();
        System.out.println("int ");
    }
    Driver(long a)
    {
        this(10);
        System.out.println("long");
    }


    public static void main(String[] args) {
        Driver obj = new Driver(10l);
        
    }
   
}
