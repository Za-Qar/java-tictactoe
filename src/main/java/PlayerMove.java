import java.util.Scanner;

public class PlayerMove
{
    private static int move;
    public static int getPlayerMoveChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your turn: ");
        move = scanner.nextInt();
        return move;
    }
    public static int getPCMoveChoice(){
        return (int) Math.floor(Math.random() * 9) + 1;
    }
}
