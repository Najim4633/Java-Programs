import java.util.Arrays;

public class DualSort {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0]= new Employee(1, "Najim", 500000, "Software dev");
        employees[1]= new Employee(4, "Deep", 35000, "QA");
        employees[2]= new Employee(5, "Shreyas", 50000, "HR");
        employees[3]= new Employee(3, "Aashish", 300000, "Finance");
        employees[4]= new Employee(2, "Vishal", 150000, "Qa");

        for(Employee employee :employees)
        {
            System.out.println(employee);
        }
        Arrays.sort(employees);
        System.out.println(" =====================================");

        for(Employee employee :employees)
        {
            System.out.println(employee);
        }


    }
    
}
class Employee implements Comparable<Employee>{
    int empid;
    String name;
    double sal;
    String dept;

    Employee(int empid, String name, double sal, String dept)
    {
        this.empid=empid;
        this.name=name;
        this.sal =sal;
        this.dept=dept;
    }
    public String toString()
    {
    return (empid+" | "+name+" | "+dept+" | "+sal);
    }
    // //ascending by empid
    // @Override
    // public int compareTo(Employee emp) {
    //     return this.empid-emp.empid;
    // }
    // //descending by empid
    // @Override
    // public int compareTo(Employee emp) {
    //     return this.empid-emp.empid;
    // }
    //descending by name 
    // @Override
    // public int compareTo(Employee emp) {
    //     return emp.name.compareTo(this.name);
    // }

    // //ascending by name
    // @Override
    // public int compareTo(Employee emp) {
    //     return this.name.compareTo(emp.name);
    // }
    //ascending by name
    @Override
    public int compareTo(Employee emp) {
        return  (int) ((int) this.sal-emp.sal);
    }
}

