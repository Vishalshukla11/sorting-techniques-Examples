package HeapSort;
class HeapSortExample
{
    public static void main(String args[])
    {
        int [] arr= {12,11,13,5,6,7};
        int n= arr.length;
          HeapSortExample H1= new HeapSortExample();
        System.out.println("Original Array:");
        H1.printArray(arr);

        //call the method for sort 
        H1.heapSort(arr);
        System.out.println("\nSorted Array:");
        H1.printArray(arr);
    }

    //method for heap sort 
    public void heapSort(int []arr)
    {
        int n=arr.length;

        //build max heap 
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }

    // utility method to heapify a subtree reeted with node i which is an index in arr[]

    public void heapify(int[]arr,int n,int i)
    {
        int largest =i; // initialize largest as root 
        int left=2*i+1; //left child
        int right =2*i+2; // right child
        
        //if left child is larger  than root 
        if(left <n && arr[left]> arr[largest])
        largest=left;

        //if right child is larger than largest so far 
        if(right< n && arr[right] > arr[largest])
        largest=right;

        //if largest is not root 
        if(largest!=i)
        {
            int swap =arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            //Recursively heapify the affected sub-Tree

            heapify(arr,n,largest);
        }


    }

    public void printArray(int [] arr)
    {
        for(int value : arr)
        {
            System.out.print(value+ " ");
        }
        System.out.println();
    }

}