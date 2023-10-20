import java.util.Scanner;

public class General {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Input num1: ");
        int num1 = input.nextInt();
        System.out.println("Input num2: ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.printf(" num1 %s " , num1);
        }
        else if(num1 < num2){
            System.out.printf(" num2 %s " , num2);
        }
        else{
            System.out.printf(" num1 %s == num2 %s" , num1 , num2);
        }
    }
}
