package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    String passW = "[A-Z][a-z]{2}[0-9]{2}[@]+$";

    public void password() {
        System.out.println("Enter User Pass_Word");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(passW);
        Matcher matcher = pattern.matcher(input);

        if (pattern.matches(passW, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
    }
}
