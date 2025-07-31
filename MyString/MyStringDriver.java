import java.util.Arrays;

@SuppressWarnings("serial")
class MyStringIndexOutOfBoundsException extends RuntimeException {
    public MyStringIndexOutOfBoundsException(String message) {
        super(message);
    }
}

final class MyString {
    final char[] arr;

    public MyString() {
        arr = new char[0];
    }

    public MyString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
    }

    public MyString(StringBuffer sb) {
        this(sb.toString());
    }

    public MyString(StringBuilder sb) {
        this(sb.toString());
    }

    public MyString(char[] arr) {
        this.arr = arr.clone();
    }

    public MyString(char[] arr, int start, int count) {
        if ((start + count) > arr.length)
            throw new MyStringIndexOutOfBoundsException(
                "INVALID [" + start + "," + count + "] out of bounds for length " + arr.length
            );

        this.arr = new char[count];
        for (int i = start, j = 0; i < (start + count); i++, j++)
            this.arr[j] = arr[i];
    }

    public int length() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public char charAt(int indx) {
        if (indx < 0 || indx >= arr.length)
            throw new MyStringIndexOutOfBoundsException(
                "Index " + indx + " out of bounds for length " + arr.length
            );
        return arr[indx];
    }

    public int codePointAt(int indx) {
        if (indx < 0 || indx >= arr.length)
            throw new MyStringIndexOutOfBoundsException(
                "Index " + indx + " out of bounds for length " + arr.length
            );
        return arr[indx];
    }

    public int codePointBefore(int indx) {
        return codePointAt(indx - 1);
    }

    public int codePointCount(int start, int end) {
        if (start > end || start < 0 || end < 0 || start >= arr.length || end > arr.length)
            throw new IndexOutOfBoundsException(
                "Range [" + start + "," + end + "] out of bounds for length " + arr.length
            );
        return end - start;
    }
    public MyString toUpperCase() {
    char[] upper = new char[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 'a' && arr[i] <= 'z')
            upper[i] = (char) (arr[i] - 32); // ASCII conversion
        else
            upper[i] = arr[i];
    }
    return new MyString(upper);
}

public MyString toLowerCase() {
    char[] lower = new char[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 'A' && arr[i] <= 'Z')
            lower[i] = (char) (arr[i] + 32); // ASCII conversion
        else
            lower[i] = arr[i];
    }
    return new MyString(lower);
}


    @Override
    public String toString() {
        String str = "";
        for (char ele : arr)
            str += ele;
        return str;
    }
}

public class MyStringDriver {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for (char ch = 'a'; ch <= 'z'; ch++)
            arr[ch - 97] = ch;

        MyString str = new MyString(arr);
        System.out.println(str.codePointCount(6, 7));

        String a = "ABCDEFGHIJK";
        MyString str2 = new MyString(a);
        System.out.println(str2.codePointCount(6, 7));
    }
}
