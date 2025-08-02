public class InsertExample
{
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("hello ");
        System.out.println(sb);

        sb.insert(0, 123);
        System.out.println(sb);

        sb.insert(0, 12.45d);
        System.out.println(sb);

        sb.insert(0, 34.43f);
        System.out.println(sb);

        sb.insert(0, 999l);
        System.out.println(sb);

        sb.insert(0, 'a');
        System.out.println(sb);

        sb.insert(0, false);
        System.out.println(sb);

        sb.insert(0, new char[] {'a','b','c'});
        System.out.println(sb);

        sb.insert(0, new StringBuilder("StringBuilder"));
        System.out.println(sb);

        sb.insert(0, "String ");
        System.out.println(sb);

        


    }
}