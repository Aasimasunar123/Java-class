import java.util.Scanner;
publiclic  class arithmetic{
    pubstatic void main (String[] args){
        int a,b,c;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter two number");
        a=in.nextInt();
         b=in.nextInt();
         c=a+b;
         System.out.println("Addition of two numbers:"+c);
    }
}
