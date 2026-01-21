<h1>🎮 Tic Tac Toe Game (Java – Console Based) </h2>
A fully functional console-based Tic Tac Toe game implemented in Java using a 3×3 board.
The game supports two players, validates user input, detects wins and draws, and allows multiple rounds with score tracking.

<h2>📌 Features</h3>

✅ 3×3 Tic Tac Toe board

👥 Two-player support (Player X & Player O)

🔄 Turn-based gameplay

❌ Robust input validation (prevents crashes on invalid input)

🏆 Win detection (rows, columns, diagonals)

🤝 Draw detection

🔁 Option to play multiple games

📊 Score tracking across games

🧹 Clean console UI with row & column indices

<h2>🛠 Technologies Used</h2>

Java

Scanner class for input handling

2D char array for board representation

<h2>▶️ How to Run the Game</h2>
1️⃣ Compile the Program
<pre> javac tictactoe.java </pre>

2️⃣ Run the Program
<pre> java tictactoe </pre>
<h2>🎯 How to Play</h2>

Enter names for Player 1 (X) and Player 2 (O)

The board displays row and column indices (0–2)

On your turn, enter:

<pre> row column </pre>


Example:

<pre> 1 2 </pre>


The game checks for:

Valid input

Valid move

Win condition

Draw condition

After each game, choose whether to play again

<h2>🧠 Game Rules</h2>

The game is played on a 3×3 grid

Player 1 uses X

Player 2 uses O

Players take turns

First player to align 3 marks horizontally, vertically, or diagonally wins

If the board fills with no winner → Draw

<h2>📂 Code Structure</h2>
<pre>
Method                   Description <br>
initializeBoard()	     Initializes the board with empty cells <br>
printBoard()	         Displays the board with row & column numbers <br>
isValidMove()	         Validates row, column, and empty cell <br>
hasWon()	             Checks all win conditions <br>
isDraw()	             Checks if the board is full <br>
switchPlayer()           Switches between X and O <br>
startGame()              Runs a single game round <br>
main()                   Handles players, replay logic, and score <br>
</pre>
<h2>🛡 Input Validation</h2>

Prevents crashes due to:

Alphabetic input

Special characters

Out-of-range values

Already occupied cells

Uses Scanner.hasNextInt() for safe input handling

📊 Sample Board Output <br>
<pre>
   0    1    2
  +---+---+---+
0 | X | - | O |
  +---+---+---+
1 | - | X | - |
  +---+---+---+
2 | O | - | X |
  +---+---+---+
</pre>

<h2>👨‍💻 Author</h2>

Developed as a learning and practice project to understand:

2D arrays

Game logic

Input validation

Control flow

Java fundamentals
