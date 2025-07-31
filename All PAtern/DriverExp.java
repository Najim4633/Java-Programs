@FunctionalInterface
interface MathOperation
{
    double pow(int num, int pow);
}
class Power implements MathOperation
{
    public double pow(int num, int pow)
    {
        int res=1;
        while(pow>0)
        {
            res*=num;
            pow--;
        }
        return res;
    }
}
public class DriverExp {
    public static void main(String[] args) {
        Power obj = new Power();
        System.out.println(obj.pow(2, 4));
    }
    
}
