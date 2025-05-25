package infosys;

import java.util.Scanner;

public class alice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n%5 ==2 || n%5==0){
            System.out.println("bob won");
        }else{
            System.out.println("alice won");
        }

    }
    
}
// Alice and Bob are playing a game called "Stone Game". Stone game is a
// two-player game. Let N be the total number of stones.
// In each turn,
// a player
// can remove 1 or 4
// stones.The player
// who picks
// the last stone,
// wins. They follow the"Ladies First"
// norm.Hence Alice
// is always
// the one
// to make
// the first
// move.Your task
// is to
// find out
// whether Alice
// can win,if
// both play
// the game
// optimally