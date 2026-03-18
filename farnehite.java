    //to convert farnehite to celcius ^
import java.util.Scanner;
class farnehite_to_celcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of farnehite: ");
        int farnehite=sc.nextInt();
        System.out.print("celcius: ");
        int celcius=(farnehite-32)*5/9;
        System.out.print(celcius);
        System.out.println(" C");
    }
    
}
