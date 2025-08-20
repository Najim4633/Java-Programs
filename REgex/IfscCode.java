import java.util.regex.Pattern;
public class IfscCode {
    public static void main(String[] args) {
        String[] ifscCodes = {
    // ✅ Valid
    "SBIN0001234", // State Bank of India
    "HDFC0005678", // HDFC Bank
    "ICIC0009876", // ICICI Bank
    "PNNB0001122", // Punjab National Bank
    "AXIS0003344", // Axis Bank

    // ❌ Invalid
    "SBIN001234",   // Only 10 characters
    "HDFC00056789", // 12 characters
    "IC1C0009876",  // Digit in bank code
    "PNB00001122",  // Bank code only 3 letters
    "AX1S0003344"   // Digit inside bank code
};



for(String str : ifscCodes)
{
    if(isValidNum(str))
    {
        System.out.println(str+ "  is valid ");
    }
    else{
        System.out.println(str+ "  is  not valid ");
    }
}
        
    }
        static boolean isValidNum(String str) {
        String regex = "^[A-Z]{4}0[0-9A-Z]{6}$";
        return Pattern.matches(regex, str);

    }
}

