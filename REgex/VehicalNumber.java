import java.util.regex.Pattern;

public class VehicalNumber {
    public static void main(String[] args) {
        String[] vehicleNumbers = {
    // ✅ Valid examples
    "MH12AB1234", // Maharashtra
    "DL05CD5678", // Delhi
    "KA01EF9999", // Karnataka
    "GJ18GH0001", // Gujarat
    "TN10IJ4567", // Tamil Nadu

    // ❌ Invalid examples
    "MH123AB1234", // Extra digit in RTO code
    "DL05C5678",   // Missing one letter in series
    "KAA1EF9999",  // Wrong state code format
    "GJ18GHI001",  // Extra letter in series
    "TN10IJ45678"  // Extra digit in number
};

for(String str : vehicleNumbers)
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
        String regex = "^[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, str);

    }
}
