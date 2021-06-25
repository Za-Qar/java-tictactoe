public class TictTacToe {
    public static void main (String[] args){
        while(Game.winner(Board.getBoard()) == 0){

            int playerMove = PlayerMove.getPlayerMoveChoice();
            System.out.println("this is player move: " + playerMove);
            while (!Board.registerPlayerMove(playerMove)){
                Board.drawBoard();
                playerMove = PlayerMove.getPlayerMoveChoice();

                if(Board.registerPlayerMove(playerMove))
                    break;
            }

            int CPUMove = PlayerMove.getPCMoveChoice();
            while (!Board.registerCPUMove(CPUMove)){
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
