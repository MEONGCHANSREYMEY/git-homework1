import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            // step 1 Must be exactly 8 characters
            if (password.length() != 8) {
                System.out.println("Invalid: Password must be 8 characters long.");
                continue; 
            }

            // step 2Must start with a digit
            // if user input character befor digit wrong 
            if (Character.isDigit(password.charAt(0)) == false) {
                System.out.println("Invalid: Password must start with a digit.");
                continue;
            }

            // start counting letter
            int upperCount = 0;
            // start counting specialchar like(# @ %)
            int specialCharCount = 0;

            // step  3 & 4: Loop to count Uppercase and Special Characters
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                // If it's NOT a letter and NOT a digit, it's a special char
                if (Character.isLetterOrDigit(ch) == false) {
                    specialCharCount++;
                }

                // If it's uppercase, count it
                if (Character.isUpperCase(ch)) {
                    upperCount++;
                }
            }

            // if you use any symbol you have to try it again
            if (specialCharCount > 0) {
                System.out.println("Invalid: Only letters and digits are allowed.");
                continue;
            }

            // final check if you miss some ifo you have to try it again
            if (upperCount == 0) {
                System.out.println("Invalid: Must contain at least one uppercase letter.");
                continue;
            }

            // If user put the password corrrect show them!
            System.out.println("Password is valid.");
            break; 
        }
        sc.close();
    }
}