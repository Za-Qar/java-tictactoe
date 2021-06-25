import java.util.Scanner;

public class TictTacToe {
    public static void main (String[] args){
        Board.drawBoard();
        Game.currentPlayer();
        System.out.println(PlayerMove.getPcLocation());

    }
}
