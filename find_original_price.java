    //find original price   ^
import java.util.Scanner;
    class find_original_price {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //original price of items
        System.out.print("enter the price of pen:");
        int pen =sc.nextInt();
         System.out.print("enter the price of pencil:");
        int pencil =sc.nextInt();
         System.out.print("enter the price of book:");
        int book =sc.nextInt();
        System.out.print("total price: ");
        int total_price=pen+pencil+book;
        System.out.println(total_price);
         System.out.print("enter the price of pen_discount:");
        int pen_discount =sc.nextInt();
         System.out.print("enter the price of pencil_discount:");
        int pencil_discount =sc.nextInt();
         System.out.print("enter the price of book_discount:");
        int book_discount =sc.nextInt();
        System.out.print("total dicount: ");
        int total_discount=pen_discount+pencil_discount+book_discount;
        System.out.println(total_discount);
        System.out.print("percentage: ");
        float percentage=total_price*total_discount/100;
        System.out.print(percentage);
        System.out.println("%");
        System.out.print("original price: ");
        float original_price=total_price-percentage;
         System.out.println(original_price);
    }
}
