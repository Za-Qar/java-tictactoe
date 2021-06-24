public class Board {
    char [][] board = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    public void ticTacToeBoard(){
        for(char[] row : board){
            for(char space : row){
                System.out.print(space);
            }
            System.out.println();
        }
    }
}
