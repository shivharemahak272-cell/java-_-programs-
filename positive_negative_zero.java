//   ^
import java.util.Scanner;
public class positive_negative_zero {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();   
        if(a >0){
            System.out.print("num is positive");
        } 
        if(a ==0){
            System.out.print("num is zero");
        }
        if(a <0){

            
            System.out.print("num is negative");
        }
}
}