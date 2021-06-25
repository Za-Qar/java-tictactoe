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

    public int getPlayerLocation(){
        return PlayerMove.getCurrentLocation();
    }
}
