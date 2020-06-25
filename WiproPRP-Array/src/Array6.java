import java.util.Arrays;
public class Array6 
{
public static void main(String[] args) 
{
	int arr[]=new int[]{8,2,8,14,16,10};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
}
}