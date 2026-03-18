//            ^
import java.util.Scanner;
public class find_2_largest_num {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();   
                System.out.print("enter the value of b:");
        int b=sc.nextInt();   
                System.out.print("enter the value of c:");
        int c=sc.nextInt();  
        if(a<b && a<c){
        System.out.print("b is greater and c is greater then a " );    
        } 
        if(b <a && b<c){
            System.out.print("a is greater and c is greater then b ");  
        }
        if(c<a && c<b){
            System.out.print("b is greater and a is greater then c ");  
        }
}   

}
