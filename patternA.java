import java.util.*;
public class patternA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int d=a+64;
                char ch=(char)d;
                System.out.print(ch);
                a++;
            }
            System.out.println();
        }
        sc.close();

    }
}
