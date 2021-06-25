public class Game extends PlayerMove
{
    public static void currentPlayer(){
        // if it's player 1's turn then
        // else Math.random the move
        getCurrentLocation();
    }
    public int winner(char[][] board){
        if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
            return 1;
        else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
            return 1;
        else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
            return 1;
        else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
            return 1;
        else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
            return 1;
        else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
            return 1;
        else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
            return 1;
        else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
            return 1;
        else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
            return 1;
        else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
            return 1;
        else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
            return 1;
        else if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
            return 1;
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
            return 1;
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
            return 1;
        else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
            return 1;
        else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
            return 1;
        else
            return 0;
    }

}
