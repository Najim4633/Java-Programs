import java.util.regex.Pattern;

public class DrivingLicence {
    public static void main(String[] args) {
        String[] dlNumbers = {
    // ✅ Valid
    "MH1420150001234", // Maharashtra
    "DL0120180005678", // Delhi
    "KA0520100009999", // Karnataka
    "GJ1820220004567", // Gujarat
    "TN1020190008888", // Tamil Nadu

    // ❌ Invalid
    "MH142015001234",   // Only 15 chars (missing 1 digit)
    "DL01201800056789", // 17 chars (extra digit)
    "KAA520100009999",  // State code contains 3 letters
    "GJ18202A0004567",  // Year contains a letter
    "TN10201900088A8"   // Unique number contains a letter
};

  for(String str : dlNumbers)
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
        String regex = "^[A-Z]{2}[0-9]{2}[0-9]{4}[0-9]{7}$";
        return Pattern.matches(regex, str);

    }
    
}
