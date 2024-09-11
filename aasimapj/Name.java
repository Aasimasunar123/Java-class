import java.util.Scanner;
public class Name{
    public static void main(String[] args){
        String name;
        Scanner in =new Scanner(System.in);
        int i;
      
        System.out.println ("Enter a name");
        name=in.nextLine();
        for(i=1; i<=100; i++){
            System.out.println(name+" ");
        }
    }
}