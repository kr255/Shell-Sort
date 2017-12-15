package sort.shell;


public class Main {
	 static int compcount = 0;
	
	
	static int compare(int arr[], int i, int j)
	{
		if (arr[i] > arr[j])
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	 static int shellsort(int arr[])
	    {
	        int n = arr.length;
	        for (int space = n/2; space > 0; space /= 2)
	        {

	            for (int i = space; i < n; i += 1)
	            {
	                int key = arr[i];
	                int j;
	                for (j = i; j >= space && arr[j - space] > key; j -= space)
	                {
	                	arr[j] = arr[j - space];
	                	if(compare(arr, i, j) == 0)
	                	{
	                		compcount +=1;
	                	}
	                }

	                arr[j] = key;
	            }
	        }
	        return compcount;
	    }

	 static void InsertionSort(int arr[])
	 {
		 int i, j, key;
		 for(i=1;i<arr.length;++i)
		 {
			 key=arr[i];
			 j = i-1;
			 while(j>=0 && arr[j] > key)
			 {
				arr[j+1] = arr[j];
             	if(compare(arr, i, j) == 1)
             	{
             		compcount +=1;
             	}
				j--;

			 }
			 arr[j+1] = key;
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {5,4,3,2,1};
	       
	        //InsertionSort(arr);
		 	shellsort(arr);
		 
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i] + " ");
	    }
	    System.out.println("compcount is " + compcount + " \n");
	}

}
