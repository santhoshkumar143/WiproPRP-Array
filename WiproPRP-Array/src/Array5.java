import java.util.*;
public class Array5 {

	public static void main(String[] args)
	{
		int arr[]=new int[]{8,2,4,9,3};
	    Arrays.sort(arr);
	    System.out.println("Largest two:"+arr[arr.length-1]+" "+arr[arr.length-2]);
	    System.out.println("Smallest two:"+arr[0]+" "+arr[1]);
	}

}