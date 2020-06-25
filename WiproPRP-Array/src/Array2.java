import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int j=1;j<n;j++)
		{
			if(arr[j]>max)
				max=arr[j];
				
		}
		System.out.print("Maximum="+max);
		int min=arr[0];
		for(int j=1;j<n;j++)
		{
			if(arr[j]<min)
				min=arr[j];
				
		}
		System.out.println("Minimum="+min);

	}

}
