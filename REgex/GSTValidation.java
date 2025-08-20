import java.util.Scanner;
import java.util.regex.Pattern;

class GSTValidation {
    public static void main(String[] args) {
        String[] gstNumbers = {
    // ✅ Valid GSTINs
    "27AAPFU0939F1ZV", // Maharashtra
    "07AACCM9910C1ZP", // Delhi
    "29AAACG2115R1Z2", // Karnataka
    "19AABCU9603R1Z2", // West Bengal
    "22AAAAA0000A1Z5", // Chhattisgarh (dummy format)

    // ❌ Invalid GSTINs
    "27AAPFU0939F1Z",   // Only 14 chars, missing last
    "07AACCM9910C1ZPP", // Extra char at end
    "99AACCM9910C1ZP",  // Invalid state code 99
    "27AA@FU0939F1ZV",  // Special char @ not allowed
    "27AAPFU0939F1Z9"   // 15th char invalid (should be 0-9 or A-Z)
};
    for( String str : gstNumbers)
    {
        if(isValidGSt(str))
        {
            System.out.println(str +" is valid ");
        }
        else
        {
            System.out.println("not valid ");
        }
    }

        
    }

    static boolean isValidGSt(String str) {
        String regex = ("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-9]{1}[A-Z0-9]{2}$");
        return Pattern.matches(regex, str);

    }
}