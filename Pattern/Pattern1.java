public class Pattern1 {
    public static void main(String[] args) {
        // int num= 5;
        // for(int i=1; i<=num; i++)
        // {
        //     for(int j= 1; j<=(num-i); j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }
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
