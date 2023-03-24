import java.util.*;

public class A1113316_0317_1{
	public static void main(String [] agvc){
	int n,m;

    System.out.println("please input n");
	Scanner input1 = new Scanner(System.in);
	n = input1.nextInt();

	System.out.println("please input m");
	Scanner input2 = new Scanner(System.in);
	m = input2.nextInt();

	int[][] arr = new int [n][m];
	for (int i=0; i<n; i++){
		for (int j=0; j<m; j++){
			arr[i][j]=(i+1)*(j+1);
		}
	}
	for (int[] i:arr){
		for (int j:i){
			System.out.print(j+" ");
		}
	System.out.println();
	}
    }
}