# Chess Board Game

This console game application simulates a chessboard and the movements of various types of pieces on the chessboard.

### Chessboard

The chessboard is an 8 x 8 grid with 64 cells in it.
With 8 rows (A, B, C.... H) and 8 columns (1, 2, 3.... 8), each cell can be uniquely identified with its cell number.

## Getting Started

The game of chess has 6 unique types of pieces, with their own unique types of movements. 

1. King -> Can move only 1 step at a time in all 8 directions (horizontal, vertical and diagonal)

2. Queen -> Can move across the board in all 8 directions

3. Bishop -> Can move across the board only diagonally

4. Horse -> Can move across the board only in 2.5 steps (2 vertical steps and 1 horizontal step)

5. Rook -> Can move across the board only vertically and horizontally

6. Pawn – Can move only 1 step at a time, in the forward direction, vertically. Can also move 1 step forward diagonally, in order to eliminate an opposing piece.

### Prerequisites
The board is empty. This means that the pawn cannot move diagonally.

## Built With

* [Maven](https://repo.maven.apache.org/maven2) - Dependency Management
* [Java] - Programming Language

### Libraries

* [jUnit](https://junit.org/junit4/dependency-info.html) - Testing Framework 


## Run

Doing a maven install runs all the test cases and builds the project.
The entry point is Chess.java
 

