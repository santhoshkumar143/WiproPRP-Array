public class Array1 {
public static void main(String[] args) {
		int arr[]= {5,8,6,7,2,16};
		int sum=0;
		float avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("sum ="+sum);
		System.out.println("Average="+avg);
		}

}
