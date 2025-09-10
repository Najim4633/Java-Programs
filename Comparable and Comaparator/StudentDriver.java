import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
class SortByName implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {   
        return o2.getName().compareTo(o1.getName());
    }
}
class Student {
    private String name;
    private Integer rollNo;
    private Long contactNum;
    private String email;

    public Student(String name, Integer rollNo, Long contactNum, String email)
    {
        this.name =name;
        this.email=email;
        this.rollNo=rollNo;
        this.contactNum=contactNum;
    }
    public String getName()
    {
        return name;
    }
    public Long getcontactNum()
    {
        return contactNum;
    }
    public Integer getrollNo()
    {
        return rollNo;
    }
    public String getEmail()
    {
        return email;
    }
    public String toString()
    {
        return "Student name : "+name+"\n Roll No : "+rollNo+"\n Contact no : "+contactNum+"\n email "+email+"\n ==================================================================\n";
    }
}

public class StudentDriver
{
    public static void main(String[] args) {
        Student student1 =new Student("najim", 001, 1234567890l, null);
        Student student2 =new Student("ashish", 002, 78664123941l, null);
        Student student3 =new Student("Deep", 003, 8543216565l, null);
        Student student4 =new Student("shreyas", 004, 5548892165l, null);
        Student student5 =new Student("inodo", 005, 56423841233l, null);
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(student5);
        list.add(student4);
        list.add(student3);
        list.add(student2);
        list.add(student1);
        
        Comparator<Student> c= new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getrollNo().compareTo(o2.getrollNo());
            }
        };

        Collections.sort(list,c);
        // Collections.sort(list,new SortByName());
        System.out.println(list);

    }
}

