package Assignment_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    String name = "^[A-Z][a-z]{3}+$";

    public void firstName() {
        System.out.println("Enter User Name");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(input);

        if (pattern.matches(name, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
    }
}
