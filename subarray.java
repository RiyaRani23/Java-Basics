import java.util.*;
public class subarray {
    public static void print_subarray(int arr[]){
        int tp=0;
        int max_sum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for (int j=i;j<arr.length;j++){
                int sum=0;
                System.out.print("subarray : ");
                  for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    sum= sum +arr[k];             
                  }
                 
                  if(max_sum<sum){
                    max_sum=sum;
                
                  }
                  
                  tp++;
                  System.out.println(" // sum = "+sum);
                  
            }
            System.out.println();
        
        }
        System.out.println("total pairs = "+tp);
        System.out.println("maximum sum = "+max_sum);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,-4,5,-6};
        print_subarray(arr);
    }
    
}
