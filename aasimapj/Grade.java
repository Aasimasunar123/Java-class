import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
  Scanner obj=new Scanner (System.in);
  System.out.println ("Enter a number between 1 to 100");  
  int n=obj.nextInt();
  if (n>90){
    System.out.println ("show the grade A++");
  }  
  else if (n>80){
    System.out.println ("show the grade B++");
  }
  else if(n>70) {
System.out.println ("show the grade B");}
else if(n>20)
System.out.println ("fail");
  }
    }
