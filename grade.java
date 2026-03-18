//         ^
import java.util.Scanner;
public class grade {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks: ");
        int marks=sc.nextInt();
        if(marks>91 && marks<101){
            System.out.println("grade 'A'");
        }
        if(marks>81 && marks<91){
            System.out.println("grade 'B'");
        }
        if(marks>71 && marks<81){
            System.out.println("grade 'C'");
        }
        if(marks>61 && marks<71){
            System.out.println("grade 'D'");
        }
        if(marks>51 && marks<61){
            System.out.println("grade 'E'");
        }
        if(marks<=50){
            System.out.println("grade 'Fail'");
        }
    }
}
