import java.util.Scanner;

public class TictTacToe {
    public static void main (String[] args){
        drawBoard();
        drawBoard();
    }

    public static void drawBoard(){
        char [][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        for(char[] row : board){
            for(char space : row){
                System.out.print(space);
            }
            System.out.println();
        }

        int move;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your turn: ");
        move = scanner.nextInt();
        System.out.println(move);

        if(move == 1){
            board[0][0] = 'X';
        }
    }
}
