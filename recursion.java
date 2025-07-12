public class recursion {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;

    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int add=n+sum(n-1);
        return add;
    }
    public static int fibo(int n){
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        int fibonacci=fibo(n-1)+fibo(n-2);
        return fibonacci;
        
    }
    public static boolean isSorted(int arr[],int i){
        // if(i==1){
        //     return true;
        // }
        // if(arr[i]<arr[i-1]){
        //     return false;
        // }
        // return isSorted(arr, i-1);
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int searchIndex(int arr[],int key,int i){
        if (i==arr.length){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }
      
        return searchIndex(arr,key,i+1);

    }
    public static int searchlastIndex(int arr[],int key,int i){
        if (i==0){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }
      
        return searchIndex(arr,key,i-1);

    }
    static int n=0;
    public static void occurence(int arr[],int key,int i){
        n++;
        if (i==arr.length-1){   
               return ;
        }
        if (arr[i]==key){
             System.out.print(i+" ");   
           
        }
         occurence(arr, key, i+1); 
    }

  
    
    public static void main(String[] args) {
        // int n=3;
        // for(int n=0;n<27;n++){

        
        // System.out.print(fibo(n)+" ");
    // }
       int arr[]={3,2,4,5,6,2,7,2,2};
    //    int i=arr.length-1;
         int i=0;
        int key=2;
        
        
      occurence(arr, key, i);
      System.out.println("\n"+n);
       }

    }
    
    

