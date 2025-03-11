/*
Java program
To input a matrix and print the same
*/
import java.util.*;
public class Matrix{
	public static void main(String[] args){
	  	Scanner sc = new Scanner(System.in);
		int r,c,i,j;
		int arr[][];
		System.out.print("Enter the no. of rows : ");
		r = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		c = sc.nextInt();
		arr = new int[r][c];
		System.out.println("Enter elements of matrix :-");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered matrix is :-");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}
}