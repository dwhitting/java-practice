import java.util.Scanner;

public class Battleship {

    public static void main(String[] args) {
        System.out.println("Welcom to Battleship!");
        System.out.println("");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");

        char[][] player1 = new char[5][5];
        char[][] player2 = new char[5][5];

        player1[2][2] = 'X';
        printBattleShip(player1);

        //int[][] locsPlay1 = setLocations();



    }

    private static int[][] setLocations() {
        int locs[][] = new int[5][2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter ship %d location:\n", (i + 1));

            if (input.hasNextInt()) {
                locs[i][0] = input.nextInt();
            } else {
                i--;
                input.nextLine();
                continue;
            }
            if (input.hasNextInt()) {
                locs[i][1] = input.nextInt();
            } else {
                i--;
                input.nextLine();
                continue;
            }
        }


        return locs;
    }

    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }
}