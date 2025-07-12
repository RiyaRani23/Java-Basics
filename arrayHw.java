public class arrayHw {
    // 1
    public static boolean check_repeat(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                   return true;
                }
            }
        }
        return false;
    }
    // 5
    public static int factorial(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        return product;
    }
    // 5
    public static void check(int nums[] ){
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(factorial(nums[i])==j && factorial(nums[i])==k && factorial(nums[j])==k
                    && nums[i]+nums[j]+nums[k]==0){
                                System.out.println("["+nums[i] +","+ nums[j]+","+ nums[k]);
                    }
                    
                }
                
            }
        }
    }
    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        // boolean check=check_repeat(nums);
        // if (check==true){
            //  System.out.println("duplicate number true");
        // }
        // else{
            // System.out.println("no any duplicate number False");
        // }
       check(nums);
    }
    
}
