
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
public class Transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // /     // TODO code application logic here
       Scanner s=new Scanner(System.in);
       int m=s.nextInt();
       int n=s.nextInt();
       int matrix[][]=new int[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               matrix[i][j]=s.nextInt();
           }
       }
       int[][] res=transpose(matrix,m,n);
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(res[i][j]+" ");
           }System.out.println();
       }
    }
    private static int[][] transpose(int[][] arr,int m,int n){
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
}
