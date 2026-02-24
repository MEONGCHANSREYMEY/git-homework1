import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();

        // to store the sentences when it already remove the duplicates
        String result = "";

     
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //check the space
            if (ch == ' ') {
                result += ch;
            } 
            
            // 
            else if (result.toLowerCase().indexOf(Character.toLowerCase(ch)) == -1) {
                result += ch;
            }
        }

        
        System.out.println("Result: " + result);
        
        input.close();
    }
}