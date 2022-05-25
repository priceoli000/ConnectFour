import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean p1 = true;
        boolean p2 = false;


        int p1Turn = 0;
        int p2Turn = 0;

        boolean turn = true;
        char[][] gameBoard = new char [6][7];
        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 7; column++) {
                gameBoard[row][column] = ' ';
            }
        }
        printGameBoard(gameBoard);
        int winner = 0;
        while (winner==0) {
            if(turn) {
                System.out.println("Player 1's Turn");
            }
            if (p1) {
                oneColumn(gameBoard, 1);
            }else{
                System.out.println("Player 2's Turn");
            }
            if (p2) {
                oneColumn(gameBoard, 2);
            }
        }

        winner = whoWins(gameBoard);
        turn = !turn;

        if (p1 == true && p2 == false && winner==2) {
            if (p2 == true && p1 == false && winner == 1) {
                System.out.println("You Lose");
            }else if (winner ==1) {
                System.out.println("Winner: Player 1");
            }else if (winner == 2) {
                System.out.println("Winner: Player 2");
            }else{
                System.out.println("Draw.");
            }
        }
    }

    public static void printGameBoard(char[][]grid) {
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println("---------------");
        for (int row = 0; row < grid.length; row++) {
            System.out.print("|");
            for (int column = 0; column < grid[0].length; column++) {
                System.out.print(grid[row][column]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("---------------");
        }
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println();
    }
    public static void oneColumn(int[][] gameBoard, int code) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("column; ");
            int column = scanner.nextInt() - 1;

            if (column > 0 && column < 5) {
                for (int row = 5; row>= 0;--row); {

                    if (gameBoard[column][row]) == 0) {

                code = gameBoard[column][row];

                return code;


                }

            }
                System.out.println("Full Column");

            }else{
                System.out.println("Not valid");

            }
        }
    }

    public static char whoWins(int[][] gameBoard) {

        int p1 = 0;
        int p2 = 0;

        int tied = 0;

        for (int j = 0; j < 6; ++j) {
        for (int i = 0; i <7; ++i) {
            if (gameBoard[i][j] == 1){

            }
        }


        }
    }
}
