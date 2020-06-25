import java.util.Scanner;
public class Array12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		for (int i=0;i<3;i++)
		{
			a[i]=s.nextInt();
		}
		for (int i=0;i<3;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int[]{a[1],b[1]};
		System.out.println(c);
	}

}
