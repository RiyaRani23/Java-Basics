public class array_reverse {
    public static void reverse(int arr[]){
        int start=0,end = arr.length-1;
        while (start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,6,5,7};
        reverse(arr);
        System.out.print("reverse array is = ");
       for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
       }
    }
    
}
