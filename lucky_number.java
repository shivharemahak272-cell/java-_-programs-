//       ^
import java.util.Scanner;
public class lucky_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int lucky_number=16;
        System.out.print("guess the num between 1-30: ");
        int number=sc.nextInt(); 
        if(lucky_number==number){
            System.out.println("you won the game");
        }
         if(lucky_number<number){
            System.out.println("it is too high ,try again");
        }
         if(lucky_number>number){
            System.out.println("it is too low ,try again");
        }
}
}