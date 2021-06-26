public class TictTacToe {
    public static void main (String[] args){
        while(Game.winner(Board.getBoard()) == 0){

            int playerMove = PlayerMove.getPlayerMoveChoice();
            while (!Board.registerPlayerMove(playerMove, 'X')){
                Board.drawBoard();
                playerMove = PlayerMove.getPlayerMoveChoice();
            }

            int CPUMove = PlayerMove.getPCMoveChoice();
            while (!Board.registerPlayerMove(CPUMove, 'O')){
               Board.drawBoard();
               CPUMove = PlayerMove.getPCMoveChoice();
            }

            Board.drawBoard();

            if(Game.winner(Board.getBoard()) == 1){
                System.out.println("You won over the CPU, congrats");
                break;
            } else if (Game.winner(Board.getBoard()) == 2){
                System.out.println("The CPU won over you, shame!!!");
                break;
            }
        }
    }
}
