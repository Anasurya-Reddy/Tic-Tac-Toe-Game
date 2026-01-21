🎮 Tic Tac Toe Game (Java – Console Based)

A fully functional console-based Tic Tac Toe game implemented in Java using a 3×3 board.
The game supports two players, validates user input, detects wins and draws, and allows multiple rounds with score tracking.

📌 Features

✅ 3×3 Tic Tac Toe board

👥 Two-player support (Player X & Player O)

🔄 Turn-based gameplay

❌ Robust input validation (prevents crashes on invalid input)

🏆 Win detection (rows, columns, diagonals)

🤝 Draw detection

🔁 Option to play multiple games

📊 Score tracking across games

🧹 Clean console UI with row & column indices

🛠 Technologies Used

Java

Scanner class for input handling

2D char array for board representation

▶️ How to Run the Game
1️⃣ Compile the Program
javac tictactoe.java

2️⃣ Run the Program
java tictactoe

🎯 How to Play

Enter names for Player 1 (X) and Player 2 (O)

The board displays row and column indices (0–2)

On your turn, enter:

row column


Example:

1 2


The game checks for:

Valid input

Valid move

Win condition

Draw condition

After each game, choose whether to play again

🧠 Game Rules

The game is played on a 3×3 grid

Player 1 uses X

Player 2 uses O

Players take turns

First player to align 3 marks horizontally, vertically, or diagonally wins

If the board fills with no winner → Draw

📂 Code Structure
Method	Description
initializeBoard()	Initializes the board with empty cells
printBoard()	Displays the board with row & column numbers
isValidMove()	Validates row, column, and empty cell
hasWon()	Checks all win conditions
isDraw()	Checks if the board is full
switchPlayer()	Switches between X and O
startGame()	Runs a single game round
main()	Handles players, replay logic, and score
🛡 Input Validation

Prevents crashes due to:

Alphabetic input

Special characters

Out-of-range values

Already occupied cells

Uses Scanner.hasNextInt() for safe input handling

📊 Sample Board Output
   0    1    2
  +---+---+---+
0 | X | - | O |
  +---+---+---+
1 | - | X | - |
  +---+---+---+
2 | O | - | X |
  +---+---+---+

🚀 Future Enhancements (Optional)

GUI version (Swing / JavaFX)

AI opponent (Minimax algorithm)

Online multiplayer

Board size customization

Game timer

👨‍💻 Author

Developed as a learning and practice project to understand:

2D arrays

Game logic

Input validation

Control flow

Java fundamentals
