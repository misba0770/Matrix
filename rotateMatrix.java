
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class rotateMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
      // int n=s.nextInt();
       int matrix[][]=new int[m][m];
       for(int i=0;i<m;i++){
           for(int j=0;j<m;j++){
               matrix[i][j]=s.nextInt();
           }
       }
       transpose(matrix,m);
       for(int i=0;i<m;i++){
           for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
           }System.out.println();
       }
    }

    private static void transpose(int[][] matrix, int m) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<m;i++){
           for(int j=0;j<i;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }
        reverseRow(matrix,m);
    }

    private static void reverseRow(int[][] arr, int m) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for(int i=0;i<m;i++){
           int left=0;
           int right=m-1;
           while(left<right){
               int temp=arr[i][left];
               arr[i][left]=arr[i][right];
               arr[i][right]=temp;
               left++;
               right--;
               
           }
           
       }
       
    }
    
}
