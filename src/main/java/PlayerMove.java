import java.util.Scanner;

public class PlayerMove
{
    private static int move;
    public static int getCurrentLocation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your turn: ");
        move = scanner.nextInt();
        System.out.println(move);
        return move;
    }
    public static int getPcLocation(){
        return (int) Math.floor(Math.random() * 9) + 1;
    }
}
