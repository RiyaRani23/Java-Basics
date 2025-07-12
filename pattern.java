
import java.util.*;
public class pattern{
    public static void hollowrectangle(int n,int m){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.print("\n");
         }
    }
    public static void invertedPyramid(int n){
            for(int i=1;i<=n;i++){
                for (int j=1;j<=n-i;j++){
                System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
             System.out.println();
    }
}
public static void invertedPyramidNum(int n){
    for(int i=n;i>=1;i--){
        for (int j=1;j<=i;j++){
          System.out.print(j);        
   } 
   System.out.println();
}
}
public static void butterfly(int n){
    for (int i=1;i<=n;i++){
        // stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // inverted
    for (int i=n;i>=1;i--){
//  stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void rhombus(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            // another rhombus
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }    
}
public static void diamond(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println(); 
    }
}
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter no. of lines");      
         int n= sc.nextInt();
        //  int m= sc.nextInt();
        //   hollowrectangle(n,m);
        // invertedPyramid(n);
        // invertedPyramidNum(n);  
           butterfly(n);
            // rhombus (n);
            // diamond(n);
        sc.close();

    }   
} 
    

