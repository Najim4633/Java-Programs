public class UpCastExample {
    public static void main(String[] args) {
        Child ch =new Child();
        ch.m1();
        ch.m2();
        ch.m3();
        ch.m4();
        ch.m5();
        ch.m6();
 
        System.out.println("");
        Parent pr =new Child();
        pr.m1();
        pr.m2();
        pr.m3();
        pr.m4();
        //pr.m5();
        //pr.m6();
 
     }
    }
    
class Parent {
    
       public void m1()
       {
        System.out.println("parent");
       }
       public void m2()
       {
        System.out.println("parent");
       }
       public static void m3()
       {
        System.out.println("parent");
       }
       public static void m4()
       {
        System.out.println("parent");
       }

    
}
class Child extends Parent {
    
    public void m1()
    {
     System.out.println("Child");
    }
    public void m5()
    {
     System.out.println("Child");
    }
    public static void m3()
    {
     System.out.println("child");
    }
    public static void m6()
    {
     System.out.println("child");
    }

 
}

