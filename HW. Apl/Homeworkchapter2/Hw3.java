public class Hw3 {
    public static void main(String[] args) {
        
        // boolean stor 51 beecause i want to ingore index 0
        boolean[] lockers = new boolean[51];

        // This variable will keep track of how many lockers are open at the very end.
        int openCount = 0;

        // OUTER LOOP: Represents each player from 1 to 50.
        for (int player = 1; player <= 50; player++) {
            
            // INNER LOOP: This is the player's action.
            // 'L' starts at the player's number (e.g., Player 3 starts at Locker 3).
            // 'L += p' means the player skips ahead by their own number (3, 6, 9...).
            for (int L = player; L <= 50; L += player) {
                
                // This '!' symbol means 'NOT'. It flips the switch.
                // If it was true (open), it becomes false (closed).
                // If it was false (closed), it becomes true (open).
                lockers[L] = !lockers[L];
            }
        }

        // Now we need to show the user which lockers stayed open.
        System.out.print("Open lockers: ");

        // We check every locker from 1 to 50 one last time.
        for (int i = 1; i <= 50; i++) {
            
            // If the locker is 'true', it means it is open.
            if (lockers[i] == true) {
                
                // Print the locker number followed by a space.
                System.out.print(i + " ");
                
                // Add 1 to our total count of open lockers.
                openCount++;
            }
        }

        // Print a blank line to move to the next row in the console.
        System.out.println();

        // Finally, print the total number of lockers that were open.
        System.out.println("Total open lockers: " + openCount);
    }
}