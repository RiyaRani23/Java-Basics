public class trappedWater {
    public static int amountOfTrappedWater(int arr[]){
        int n=arr.length;
        // left maximum
        int left[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i], left[i-1]);
        }
        // right maximum
        int right[]=new int[n];
         right[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
         }
        // minimum=x
        int trappedWater=0;
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(left[i],right[i]);
           
        // height=x-height of bars
        trappedWater += waterlevel-arr[i];
       
        }
        return trappedWater;
    }
    public static void main (String args[]){
        int arr[]={4,2,0,3,2,5};
        System.out.println("trappedwater = "+amountOfTrappedWater(arr));
    } 
    
}
