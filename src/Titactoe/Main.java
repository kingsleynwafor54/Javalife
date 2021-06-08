package Titactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            try {
                System.out.println("Enter a position to play");
                int position = scanner.nextInt();
                game.makeMove(position);
            } catch (GameOverExceptions e) {
                if (game.lastValuePlayWasX) {
                    System.out.println("X winner");
                } else {
                    System.out.println("O wins");
                }
            } catch (BoardIsFullException e) {

                System.out.println("It is a draw");

                gameOver = true;

            } catch (AlreadyOccupiedException e) {
                System.out.println("already played");
            }
        }
    }
}
