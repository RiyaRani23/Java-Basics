
import java.util.*;
public class switchn {
     public static void main(String args[])  {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number between 1 to 7");
          int n = sc.nextInt();
          switch(n){
               case 1: System.out.println("Monday");
               break;
               case 2:System.out.println("tuesday");
               break;
               case 3:System.out.println("wednesday");
               break;
               case 4:System.out.println("thrusday");
               break;
               case 5:System.out.println("friday");
               break;
               case 6:System.out.println("saturday");
               break;
               case 7:System.out.println("sunday");
               break;
               default:System.out.println("not valid number");
               break;
          }
          sc.close();

          } 
}
