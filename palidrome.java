public class palidrome {
    public static void pali(int n){
        int myNum=n;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        if(rev==myNum){
            System.out.println("Palidrome number");
        }
        else
           System.out.println("not palidrome number");
    }
    public static void main (String args[]){
        int n=221;
        pali(n);
    }

    
}
