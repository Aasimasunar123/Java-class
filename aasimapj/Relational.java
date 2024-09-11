import java.util.Scanner;
public class Relational{
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        if (num1>num2)
            System.out.println("number1 is greater than number2"+(num1<num2));
            else
            System.out.println("number1 is less than number 2");
        }
    }

