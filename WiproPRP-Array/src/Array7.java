public class Array7 {

	public static void main(String[] args)
	{
		int arr[]=new int[]{12,34,12,45,67,89};
		 int j = 0;
	        for (int i=0; i < arr.length-1; i++)
	        {  
	            if (arr[i] != arr[i+1])
	            {  
	                arr[j++] = arr[i];  
	            }  
	        }  
	        arr[j++] = arr[arr.length-1];  
        for (int i=0; i<arr.length; i++)
        {  
            System.out.println(arr[i]);  
        }  
	}

}