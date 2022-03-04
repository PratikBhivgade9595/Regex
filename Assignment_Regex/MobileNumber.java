package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    String mobileN = "^[0-9]{10}$";

    public void mobile_number() {
        System.out.println("Enter User Mobile_Number");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(mobileN);
        Matcher matcher = pattern.matcher(input);

        if (pattern.matches(mobileN, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
    }
}
