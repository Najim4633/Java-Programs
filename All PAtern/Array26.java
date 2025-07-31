import java.util.Arrays;

public class Array26 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,3,4,0,1,8,3};
		System.out.println(Arrays.toString(arr));
		freq(arr);
		distinct(arr);
		uniqueEle(arr);
		//dupEle(arr);
		System.out.println(maxEle(arr));
	}

	static void freq(int[] arr) {
		System.out.println("Frequency of elements:- ");
		boolean[] cntMap = new boolean[arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			if (cntMap[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					cntMap[j] = true;
				}
			}
			System.out.println(arr[i] + ": " + count);
		}
	}

	static void distinct(int[] arr) {
		System.out.println("Distinct elements:- ");
		boolean[] cntMap = new boolean[arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			if (cntMap[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					cntMap[j] = true;
				}
			}
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	static void uniqueEle(int[] arr) {
		System.out.println("Unique elements:- ");
		boolean[] cntMap = new boolean[arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			if (cntMap[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					cntMap[j] = true;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();	
	}

	static void dupEle(int[] arr) {
		System.out.println("Duplicate elements:- ");
		boolean[] cntMap = new boolean[arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			if (cntMap[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					cntMap[j] = true;
				}
			}
			if (count > 1) {
				System.out.print(arr[i] + ":" + count + " ");
			}
		}
		System.out.println();	
	}

	static void maxEle(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("array max element is  "+max);
	}
    static void minEle(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int ele : arr){
            if(min>ele)
            {
                min=ele;
            }
        }
        System.out.println("array max element is  "+max);
    }
    static void highestRepeting(int [] arr)
    {
        System.out.println("Frequency of elements:- ");
        int high
		boolean[] cntMap = new boolean[arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			if (cntMap[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					cntMap[j] = true;
				}
			}
			
		}
    }

}