import java.util.Scanner;
public class Array3 {
  public static void main(String[] args) {
		int arr[]= {1,4,34,56,7};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
		     System.out.print(i);
			else
				System.out.print("-1");
			break;
		}
		}

}
