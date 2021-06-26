public class Game extends PlayerMove
{
    public static void currentPlayer(){
        // if it's player 1's turn then
        // else Math.random the move
        getPlayerMoveChoice();
    }
    public static int winner(char[][] board){
        if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X')
            return 1;
        else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X')
            return 1;
        else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][4] == 'X')
            return 1;
        else if(board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == 'X')
            return 1;
        else if(board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == 'X')
            return 1;
        else if(board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == 'X')
            return 1;
        else if(board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == 'X')
            return 1;
        else if(board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X')
            return 1;
        else if(board[0][4] == 'X' && board[2][2] == 'X' && board[4][0] == 'X')
            return 1;
        else if(board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O')
            return 1;
        else if(board[2][0] == 'O' && board[2][2] == 'O' && board[2][4] == 'O')
            return 1;
        else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][4] == 'O')
            return 1;
        else if(board[4][0] == 'O' && board[4][2] == 'O' && board[4][4] == 'O')
            return 1;
        else if(board[0][0] == 'O' && board[2][0] == 'O' && board[4][0] == 'O')
            return 1;
        else if(board[0][2] == 'O' && board[2][2] == 'O' && board[4][2] == 'O')
            return 1;
        else if(board[0][4] == 'O' && board[2][4] == 'O' && board[4][4] == 'O')
            return 1;
        else if(board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O')
            return 1;
        else if(board[0][4] == 'O' && board[2][2] == 'O' && board[4][0] == 'O')
            return 1;

        else
            return 0;
    }

}
