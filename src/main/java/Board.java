public class Board {
    private static char [][] board = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    public static void drawBoard(){
        for(char[] row : board){
            for(char space : row){
                System.out.print(space);
            }
            System.out.println();
        }
    }

    public static boolean registerPlayerMove(final int move, final char symbol){
        if(move == 1 && board[0][0] == ' '){
            board[0][0] = symbol;
            return true;
        } else if(move == 2 && board[0][2] == ' '){
            board[0][2] = symbol;
            return true;
        } else if(move == 3 && board[0][4] == ' '){
            board[0][4] = symbol;
            return true;
        } else if(move == 4 && board[2][0] == ' '){
            board[2][0] = symbol;
            return true;
        } else if(move == 5 && board[2][2] == ' '){
            board[2][2] = symbol;
            return true;
        } else if(move == 6 && board[2][4] == ' '){
            board[2][4] = symbol;
            return true;
        } else if(move == 7 && board[4][0] == ' '){
            board[4][0] = symbol;
            return true;
        } else if(move == 8 && board[4][2] == ' '){
            board[4][2] = symbol;
            return true;
        } else if(move == 9 && board[4][4] == ' '){
            board[4][4] = symbol;
            return true;
        } else {
            System.out.println("Invalid move, please type a different number");
            return false;
        }
    }

    public int getPlayerLocation(){
        return PlayerMove.getPlayerMoveChoice();
    }

    public static char[][] getBoard(){
        return board;
    }

//    public static void boardMoves(int rows, int columns, char player){
//        board[rows][columns] = player;
//    }
}
