import java.util.*;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(arr));
        // sort(arr);
        // System.out.println(Arrays.toString(arr));
        // Easy/Medium Problems
        // System.out.println(findLargest(arr));
        // System.out.println(findSecondLargest(arr));
        // System.out.println(Arrays.toString(reverseArray(arr)));
        // System.out.println(isSorted(arr2));
         //System.out.println(findMissingNumber(new int[]{1,2,4,5}, 5));
         //System.out.println(findDuplicates(new int[]{1,2,3,1,2,4,5,5,6,7,8,9,9}));
        // System.out.println(countFrequency(new int[]{1,1,2,3,2,4,5,1}));
         System.out.println(Arrays.toString(rotateArray(new int[]{1,2,3,4,5}, 3)));
        // System.out.println(intersection(new int[]{1,2,3,4}, new int[]{3,4,5,6}));
         //System.out.println(union(new int[]{1,2,3}, new int[]{2,3,4,5}));
    }

    // 1. Find largest element
    public static int findLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int ele : arr)
        {
            if(ele>max) max=ele;
        }
        return max;
    }

    // 2. Find second largest element
    public static int findSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE,max2=max;
        for(int ele : arr)
        {
            if(ele>max){ 
                max2=max;
                max=ele;
            }
            else if(ele<max && ele>max2)
            {
                max2=ele;
            }
        }
        return max2;

    }

    // 3. Reverse an array
    public static int[] reverseArray(int[] arrOriginal) {
        int[] arr=arrOriginal;
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }

    // 4. Check if array is sorted
    public static boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }

    // 5. Find missing number in array (1 to n)
    public static int findMissingNumber(int[] arrOriginal, int n) {
        int[] arr= arrOriginal;
        sort(arr);
        for(int i=0;i<arr.length;i++ )
        {
            if((i+1)!=arr[i])return i+1;
        }
        return 0;
    }

    // 6. Find duplicate elements
    public static List<Integer> findDuplicates(int[] arr) {
        boolean[] flags=new boolean[arr.length];
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length;i++)
        {
            if(flags[i]) continue;
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flags[j]=true;
                    count++;
                }
            }
            if(count>1) list.add(arr[i]);
        }

        return list;
    }

    // 7. Find frequency of elements
    public static Map<Integer, Integer> countFrequency(int[] arr) {
        Set<Integer> set=new LinkedHashSet<>();
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map=new LinkedHashMap<>();
        for(int ele : arr)
        {
            set.add(ele);;
            list.add(ele);
        }
        for(Integer ele: set)
        {
            map.put(ele,Collections.frequency(list, ele));
        }
        
        return map;
    }

    // 8. Rotate array by k positions
    public static int[] rotateArray(int[] arr, int k) {
        int newArr[] =arr;
        int n=newArr.length;
        k%=n;
        if(k==0) return newArr;
        for(int j=0;j<k;j++)
        {
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--)
            {
            arr[i]=arr[i-1];

            }
            arr[0]=temp;
        }
        return newArr;
    }

    // 9. Find intersection of two arrays
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        return null;
    }

    // 10. Find union of two arrays
    public static Set<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int ele:arr1)set.add(ele);
        for(int ele:arr2)set.add(ele);
        return set;
    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minindx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindx])
                {
                    arr[minindx]=arr[j];
                    minindx=j;
                }
            }
            arr[minindx]=arr[i];
            arr[i]=arr[minindx];
        }
    }
    public static void sort2(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }

        }
    }
    }
