// import java.util.*;

class MyEmptyStackException extends RuntimeException
{
    public MyEmptyStackException()
    {
        super();
    }
}

class MyStack<E>
{
    static final int INITIAL_CAPACITY = 10;
    E[] arr; // null
    int indx = 0;
    
    public MyStack()
    {
        super();
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }
    
    private int newCapacity(int oldCapacity)
    {
        return oldCapacity*2;
    }
    
    @Override
    public String toString()
    {
        String data = "[";
        if(indx==0)
        {
            return "[]";
        }
        else
        {
            for(int i =0;i<size()-1;i++)
                data+=arr[i]+", ";
            data+=arr[size()-1];
        }
        return data+"]";
    }
    
    public E push(E ele)
    {
        if(size()==arr.length)
        {
            E[] newArr =  (E[]) new Object[newCapacity(arr.length)];
            for(int i=0;i<arr.length;i++)
            {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[indx++] = ele;
        return ele;
    }
    
    public E pop()
    {
        if(size()==0)
        {
            throw new MyEmptyStackException();
        }
        E temp = arr[size()-1];
        arr[size()-1] = null;
        indx--;
        return temp;
    }
    public E peek()
    {
        if(size()==0)
        {
            throw new MyEmptyStackException();
        }
        return arr[size()-1];
    }
    public boolean isEmpty()
    {
        return (size()==0);
    }
    public int size()
    {
        return indx;
    }
}

public class MyStackDrive {
    
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        System.out.println(stack.push(10));
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }

}
