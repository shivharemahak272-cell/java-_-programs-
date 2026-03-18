//          ^
import java.util.Scanner;
public class dictansion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks: ");
        int marks=sc.nextInt();
        boolean has_pass=true;
        if(marks>=75){
            if(has_pass){
                System.out.println("you are pass with dictension");
            }
        }
            else if(marks>=45){
                if(has_pass){
                System.out.println("you are pass");
            }
        }
        else{
            System.out.println("you are fail");
        }
    }
    
}
