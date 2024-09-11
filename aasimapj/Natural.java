import java.util.Scanner;
public class Natural{
    public static void main (String [] args){
        int n,a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
         n=in.nextInt();
        for(a=1; a<=n; a++){
            System.out.println(" "+a);
        }
    }
}