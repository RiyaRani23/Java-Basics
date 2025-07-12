import java.util.*;
public class array2d {

     public static int largest(int matrix[][]){
          int large= Integer.MIN_VALUE;
         for (int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(large<matrix[i][j]){
                     large=matrix[i][j];
                 }
             }
         }
         return large;
        }
        public static int diagonalsum(int matrix[][]){
             int n=matrix.length,m=matrix[0].length;
             int dSum=0;
              if(n==m){
                for (int i=0;i<n;i++){
                   for(int j=0;j<m;j++){
                    if(i==j){
                        dSum += matrix[i][j];
                    }
                    else if (i+j==matrix.length-1){
                        dSum += matrix[i][j];
                    }
                    
            }
        }
           }
            else{
                System.out.println("not a sqaure matrix ");
                
            }
            return dSum;
        }
        public static int noOfElement(int matrix[][],int key){
            // brute force method
            int n=matrix.length,m=matrix[0].length;
            int count=0;
            for (int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                if (matrix[i][j]==7){
                  count++;
                }
                
             }
         }
         return count;
        //  only for sorted array
        // int row=0,col=matrix[0].length-1;
        // int count=0;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==key){
        //         count++;
        //         row++;
        //     }
        //     else if(key>matrix[row][col]){
        //         row++;
        //     }
        //     else{
        //         col--;
        //     }
        // }
        // return count;

        
         }

         public static int secondRowSum(int matrix[][]){
             int col=matrix[0].length;
             int sum=0;
              
            for (int i=0;i<col;i++){
               
                        sum += matrix[1][i];
                    }               
                
                  return sum;
        }
        public static void transpose(int matrix[][]){
            for(int i=0;i<matrix.length;i++){
                for(int j=i+1;j<matrix[0].length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    
    
    
     public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        // int matrix[][]= new int [3][3];
        // int n=matrix.length,m=matrix[0].length;
        // input
        // for (int i=0;i<n;i++){
            // for(int j=0;j<m;j++){
                // matrix[i][j]=sc.nextInt();
            // }
        // }
        // output
        //  for (int i=0;i<n;i++){
            // for(int j=0;j<m;j++){
            //    System.out.print(matrix[i][j]+ " ");
            // }
            // System.out.println();
        // }
        //  int sum=diagonalsum(matrix);
        // int maximum=largest(matrix);
        //  System.out.println(sum + "is the diagonal sum of matrix");
         int matrix[][]={{1,3,5},{30,60,10},{7,9,10}};
        //  int key=7;
        //  int total=secondRowSum(matrix);
          System.out.println("before" );
        for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                  System.err.print(matrix[i][j]+ " "); 
                }
                System.out.println();
            }
             System.out.println("after" );
             transpose(matrix);
        for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                  System.out.print(matrix[i][j]+ " "); 
                }
                System.out.println();
            }
            
        
        sc.close();
    }
    
}   