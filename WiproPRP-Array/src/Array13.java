import java.util.Scanner;
public class Array13 {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				a[i][j]=s.nextInt();
			}
		}

		for(int i=3-1;i>=0;i--)
		{
			for(int j=3-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}