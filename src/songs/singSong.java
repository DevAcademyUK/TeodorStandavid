package songs;

import java.util.Scanner;

import static java.lang.Thread.*;

public class singSong {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many bottles of beer are there on the wall?");
        int bottles = myScanner.nextInt();
        String word = "bottles";
        for (int i = bottles; i > 0; i--) {
            System.out.println(i + " " + word + " of beer on the wall.");
            System.out.println(i + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            if (i == 1) {
                System.out.println("No more bottles of beer on the wall.");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "bottle";
                }
                System.out.println(newNum + " " + word + " of beer on the wall.");
                System.out.println();
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Tra la la");
                }

            }
        }
    }
}



