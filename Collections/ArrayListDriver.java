import java.util.*;

class MyArrayList<E>
{
    E[] arr = null;
    public static int indx = 0;
    public static final int DEFAULT_CAPACITY = 10;
    
    public MyArrayList()
    {
        arr = (E[])new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity)
    {
         arr = (E[]) new Object[capacity];
    }
    
    public MyArrayList(MyArrayList coll)
    {
        arr = (E[])new Object[coll.size()];
        for(int i = 0; i < coll.size(); i++)
        {
            arr[i] = (E)coll.get(i);
        }
    }
    public int size()
    {
        return indx;
    }
    
    
    public boolean add(E element)
    {
        if(arr.length == size())
        {
            E newArr[] = (E[])new Object[getCapacity(arr.length)];
            for (int i = 0; i < arr.length; i++)
            {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[indx++] = element;
        return true;
    }
    
    
    public int lastIndexOf(E element)
    {
        for(int i = size()-1; i >= 0; i--)
        {
            if(arr[i].equals(element)) return i;
        }
        return -1;
    }
    
    public boolean removeAll(MyArrayList coll)
    {
        boolean flag = false;
        for(int i = 0; i < coll.size(); i++)
        {
            int oldIndex = indexOf((E)coll.get(i));
            if(oldIndex == -1)
            {
                if(remove(oldIndex)) flag = true;
            }
        }
        return flag;
    }
    
    private boolean remove(int oldIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    private int indexOf(E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }
    // Override
    public String toString()
    {
        if(size()==0)
            return "[]";
        
        String data = "[";
        for (int i=0; i<size(); i++)
        {
            data += arr[i] + ", ";
        }
        data = arr[indx-1] + "]";
        return data;
    }
    
    public boolean add(int indx, E element)
    {
        if(indx<0 || indx>size())
        {
            throw new MyArrayIndexOutOfBoundsException
            ("Index " + indx + " out of bounds for length " + size());
        }
        
        if(arr.length == size())
        {
            Object newArr[] = (E[])new Object[getCapacity(arr.length)];
            for (int i = 0; i < arr.length; i++)
            {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[indx++] = element;
        return true;
    }
    
    public boolean addAll(MyArrayList coll)
    {
        boolean flag = false;
        for(int i = 0; i < coll.size(); i++)
        {
            if(add((E)coll.get(i)))
            {
                flag = true;
            }
        }
        return flag;
    }
    
    public int getCapacity(int oldCap)
    {
        return (int)(oldCap*1.5);
    }
    
    public boolean isEmpty()
    {
        return (indx == 0);
    }
    
    public E set(int indx, E element)
    {
        if(indx<0 || indx>size())
        {
            throw new MyArrayIndexOutOfBoundsException
            ("Index " + indx + " out of bounds for length " + size());
        }
        
        E temp = arr[indx];
        arr[indx] = element;
        return temp;
    }
    
    public void clear()
    {
        arr = (E[])new Object[arr.length];
        indx = 0;
    }
    
    public boolean contains(E element)
    {
        for(int i = 0; i < size(); i++)
        {
            if(arr[i].equals(element)) return true;
        }
        return false;
    }
}

 class MyArrayListDriver
{
    public static void main(String[] args)
    {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
    }
}
