import java.util.ArrayList;

class Book
{
    String brand, type,size;
    int pages;
    double price;
    public Book(String brand, String type, String size, int pages, double price)
    {
        super();
        this.brand = brand;
        this.type = type;
        this.size=size;
        this.pages=pages;
        this.price=price;
    }
     public void displayBook()
    {
        System.out.println("\n =====================BOOK========================");
        System.out.println("brand : "+brand);
        System.out.println("type : "+ type);
        System.out.println("size : "+size);
        System.out.println("pages : "+pages);
        System.out.println("price  "+ price);
    }
}
class Pen
{
    String brand, type,color;
    int price;
    public Pen(String brand, String type, String color, int price)
        {
            super();
            this.brand = brand;
            this.type=type;
            this.color=color;
            this.price=price;
        }
       public void dispalyPen()
        {
            System.out.println("\n========================PEN=====================");
            System.out.println("brand : "+brand);
            System.out.println("type "+color);
            System.out.println("color   "+color);
            System.out.println("price  "+price);

        }
}
class Laptop
{
    private String brand;
    private String color;
    private int price;
    private String model;

    Laptop(String brand,String model,String color, int price)
    {
        super();
        this.brand =brand;
        this.model=model;
        this.color=color;
        this.price =price;
    }
    public void displayLaptop()
    {
        System.out.println("\n===================LAPTOP=======================");
        System.out.println("brand "+brand);
        System.out.println("model "+model);
        System.out.println("color  "+color);
        System.out.println("price : "+price);
    }
}
class Bag{
    private String brand, type, color,material;
    private double price, size;
    ArrayList<Book> listBook =new ArrayList<>();
    ArrayList<Pen> listPen = new ArrayList<>();
    public Bag(String brand, String type, String color, String material, double price, double size)
    {
        super();
        this.brand = brand;
        this.type=type;
        this. color= color;
        this. material= material;
        this.price= price;
        this.size= size;
    }
    public void displayBag()
    {
        System.out.println("-------------------BAG--------------------");
        System.out.println("brand  "+brand);
        System.out.println("type:  "+type);
        System.out.println("color "+color);
        System.out.println("material:  "+material);
        System.out.println("price:   "+price  );
        System.out.println("size: "  +size);
    }
    public void addBook(String brand, String type, String size, int pages, double price)
    {
        Book bookobj=new Book(brand, type, size, pages, price);
        listBook.add(bookobj);
        for(Book ele:listBook)
        {
            ele.displayBook();
        }
    }

    public void addPen(String brand, String type, String color, int price)
    {
        Pen penobj=new Pen(brand, type, color, price);
        listPen.add(penobj);
        for(Pen ele:listPen)
        {
            ele.dispalyPen();
        }
    }

    public void addLatop(String brand,String model,String color, int price)
    {
        Laptop  laptop = new Laptop(brand, model, color, price);
        laptop.displayLaptop();
    }
}
public class BagDriver {
    public static void main(String[] args) {
        Bag bag = new Bag("Nike", "Backpack", "Blue", "Leather",2000,5);
        bag.displayBag();
        bag.addBook("camel", "notebook", "a4", 200, 189);
        bag.addPen("renolds", "ballpen", "blue", 50);
        bag.addPen("belly", "ballpen", "black", 10);
        bag.addLatop("hp", "pavilion15", "purple", 150000);

    
}
}
