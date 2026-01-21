import java.util.*;

public class tictactoe {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    // Initialize the board
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    // Print the board
    static void printBoard() {
        System.out.println();
        System.out.println("Current Board:");
        System.out.println("    0   1   2");
        System.out.println("  +---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
                System.out.print("| ");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
        System.out.println();
    }

    // Validate move
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3)
            return false;
        return board[row][col] == '-';
    }

    // Check winning condition
    static boolean hasWon() {
        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer &&
                board[1][j] == currentPlayer &&
                board[2][j] == currentPlayer)
                return true;
        }

        // Diagonals
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }

    // Check draw condition
    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    // Switch player
    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    static int startGame(String player1, String player2) {
        Scanner sc = new Scanner(System.in);
        
        printBoard();

        // Additional game logic would go here
        while ( true ) {
            if(currentPlayer == 'X'  ) 
                System.out.println(player1 + "'s turn (X): ");
            else
                System.out.println(player2 + "'s turn (O): ");

            int row, col;
            do {
                while (true) {
                    System.out.println("Enter your move (row and column): ");

                    if (!sc.hasNextInt()) {
                        System.out.println("\nInvalid input! Please enter numbers only.");
                        sc.next();
                        sc.next(); // discard invalid input
                        continue;
                    }
                    row = sc.nextInt();

                    if (!sc.hasNextInt()) {
                        System.out.println("\nInvalid input! Please enter numbers only.");
                        sc.next();
                        continue;
                    }
                    col = sc.nextInt();

                    if (!isValidMove(row, col)) {
                        System.out.println("\nInvalid move. Try again.");
                        continue;
                    }

                    break; // valid input + valid move
                }
                if( !isValidMove(row, col) ) {
                    System.out.println("Invalid move. Try again.");
                }

            } while( !isValidMove(row, col) );

            board[row][col] = currentPlayer;
            printBoard();

            if( hasWon() ) {
                return (currentPlayer == 'X') ? 1 : 2;
            }

            if( isDraw() ) {
                return 0;
            }
            
            switchPlayer();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!\n");
        System.out.println("Game Rules:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println("2. Player 1 is 'X' and Player 2 is 'O'.");
        System.out.println("3. Players take turns placing their marks in empty cells.");
        System.out.println("4. The first player to get 3 of their marks in a row (horizontally, vertically, or diagonally) wins.");

        System.out.println("\nEnter Name of Player 1 (X): ");
        String player1 = sc.nextLine();
        System.out.println("\nEnter Name of Player 2 (O): ");
        String player2 = sc.nextLine();

        boolean play = true;

        int totalGames = 0;
        int player1Wins = 0;
        int player2Wins = 0;

        do {
            // Initialize the board
            initializeBoard();

            int winBy = startGame(player1, player2);

            if (winBy == 1) {
                player1Wins++;
                System.out.println(player1 + " wins this game!");
            } else if (winBy == 2) {
                player2Wins++;
                System.out.println(player2 + " wins this game!");
            } else {
                System.out.println("This game is a draw!\n");
            }

            totalGames++;
            
            System.out.println(totalGames + " Game(s) Played");
            System.out.println("Wins : \n" + player1 + " = " + player1Wins + "\n" + player2 + " = " + player2Wins);
            

            System.out.println("\nDo you want to play again? (y/n)");
            String response = sc.nextLine();

            play = response.equalsIgnoreCase("y");
        } while( play );

        System.out.println("\nThanks for playing!");

        sc.close();
    }
}