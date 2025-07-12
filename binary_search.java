
public class binary_search {
    public static int search( int arr[],int key){
         int start=0,end=arr.length-1;
         while(start<=end){
            int mid=(start + end)/2;
            if(arr[mid]==key){  //middle

               return mid;
            }
            if(arr[mid]<key){
                start=mid+1;   //right
            }
            else{
                end=mid-1;  //left
            
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key= 7;
        int find = search(arr,key);
        if(find==-1){
            System.out.println("no number found");

        }
        else {
            System.out.println("number found");
        }
    }
}