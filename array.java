import java.util.*;
public class array {
    public static void linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("number found at index"+ i);
                break;
            } 
        }      
    }
    public static int maxi_num(int arr[]){
        int max=arr[0];
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if (max<=arr[i]){
                max=arr[i];  
                maxIndex=i;            
            }
        }
        System.out.println("index = "+ maxIndex);
           return max;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
         int arr[]={201,4,5,6,5,8,4,4,8,99};
        // System.out.println("enter number ");
        //  int key=sc.nextInt();
        //  linear_search(arr, key);
        int largest_number= maxi_num(arr);
        System.out.println("largest number"+ largest_number);
         sc.close();
         }
        
    }
    

