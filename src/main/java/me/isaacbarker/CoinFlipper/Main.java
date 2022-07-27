package me.isaacbarker.CoinFlipper;

import java.util.Scanner;

public class Main {

    /*

    Coin Flipper Simulation
    - A basic JAVA program to simulate n number of coin flips.
    - Plots the number of heads, tails.

     */

    public static void main(String[] args) {
        // Print ASCII art and get number of coin slips to sim

        // ANSI colours
        String GREEN = "\u001B[32m";
        String BOLD = "\u001b[1m";
        String UNDERLINE = "\u001b[4m";
        String RESET = "\u001b[0m";

        // ASCII Art
        System.out.println("\n" +
                "\n" +
                "                                                                                                                           \n" +
                "                                                                                                                           \n" +
                "   ,---,                                                          ,---,.                           ,-.                     \n" +
                ",`--.' |                                                        ,'  .'  \\                      ,--/ /|                     \n" +
                "|   :  :                                                      ,---.' .' |             __  ,-.,--. :/ |             __  ,-. \n" +
                ":   |  '  .--.--.                                             |   |  |: |           ,' ,'/ /|:  : ' /            ,' ,'/ /| \n" +
                "|   :  | /  /    '    ,--.--.      ,--.--.     ,---.          :   :  :  /  ,--.--.  '  | |' ||  '  /      ,---.  '  | |' | \n" +
                "'   '  ;|  :  /`./   /       \\    /       \\   /     \\         :   |    ;  /       \\ |  |   ,''  |  :     /     \\ |  |   ,' \n" +
                "|   |  ||  :  ;_    .--.  .-. |  .--.  .-. | /    / '         |   :     \\.--.  .-. |'  :  /  |  |   \\   /    /  |'  :  /   \n" +
                "'   :  ; \\  \\    `.  \\__\\/: . .   \\__\\/: . ..    ' /          |   |   . | \\__\\/: . .|  | '   '  : |. \\ .    ' / ||  | '    \n" +
                "|   |  '  `----.   \\ ,\" .--.; |   ,\" .--.; |'   ; :__         '   :  '; | ,\" .--.; |;  : |   |  | ' \\ \\'   ;   /|;  : |    \n" +
                "'   :  | /  /`--'  //  /  ,.  |  /  /  ,.  |'   | '.'|        |   |  | ; /  /  ,.  ||  , ;   '  : |--' '   |  / ||  , ;    \n" +
                ";   |.' '--'.     /;  :   .'   \\;  :   .'   \\   :    :        |   :   / ;  :   .'   \\---'    ;  |,'    |   :    | ---'     \n" +
                "'---'     `--'---' |  ,     .-./|  ,     .-./\\   \\  /         |   | ,'  |  ,     .-./        '--'       \\   \\  /           \n" +
                "                    `--`---'     `--`---'     `----'          `----'     `--`---'                        `----'            \n" +
                "======================================================>isaacbarker.me<====================================================="
        );

        // Print info
        System.out.println(BOLD + "COINFLIPPER by Isaac Barker: https://isaacbarker.me");
        System.out.println(BOLD + "Please enter your number of coin flips:" + RESET);

        // Get user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Preparing to simulate " + n + " flips...");

        // Begin simulation
        double heads = 0;
        double tails = 0;

        for (int i = 0; i < n; i++) {
            CoinFlipResult res = CoinFlip.flip();
            String simNum = String.format("%03d", i+1);
            String stringRes;

            if (res == CoinFlipResult.HEADS) {
                heads++;
                stringRes = "heads";
            } else {
                tails++;
                stringRes = "tails";
            }

            // Send info
            System.out.println(BOLD + "[" + simNum + "]" + RESET + " Flipped and rolled " + UNDERLINE + stringRes + RESET);
        }

        // Send info
        System.out.println(GREEN + BOLD + "Sim completed! Info:" + RESET);

        // Numbers
        System.out.println(UNDERLINE + "Numbers:" + RESET);
        System.out.println("No. of Heads: " + heads);
        System.out.println("No. of tails: " + tails);

        // P
        double tailP = tails / n;
        double headP = heads / n;

        System.out.println(UNDERLINE + "Probabilities:" + RESET);
        System.out.println("P(Tails) = " + tailP);
        System.out.println("P(Heads) = " + headP);

        System.out.println(BOLD + "\nThank you! Check out my Github:" + RESET + "https://github.com/isaacbarker");
    }
}