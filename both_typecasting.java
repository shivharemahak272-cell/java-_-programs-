//        ^
import java.util.Scanner;
public class both_typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total price");
        int total_price=sc.nextInt();
        System.out.println("enter the total product price");
        int total_product=sc.nextInt();
        double average=total_price/total_product;
        int total=(int)average;
        System.out.println(total);
    }
}
