package QuickSort;

class QuickSortExample
{
  public static void main(String args[])
  {
    QuickSortExample Q1= new QuickSortExample();
    int [] arr={5,3,8,4,2,7,1,10,6,9};
    System.out.println("Unsorted Array");
    Q1.PrintArray(arr);

   Q1. QuickSort(arr,0,arr.length - 1);


    System.out.println("After sorted array: ");
    Q1.PrintArray(arr);

  }
public void QuickSort(int[] arr, int start,int end  )
{
    if(start<end)
    {
        //partitioning index , arr[pivot Index] is now at the right place
        int partitionIndex= partition(arr, start, end);

        //recursive sort element before and after partition
        QuickSort(arr,start, partitionIndex-1);
        QuickSort(arr,partitionIndex+ 1 ,end);
    }
}

public int partition(int [] arr, int start,int end)
{
    //choose the rightmost element as pivot
    int pivot = arr[end];

    //index of smaller element 
    int i=(start -1 );

    for(int j=start; j<end;j++)
    {
        //if current element is smaller than the pivot 
        if(arr[j]< pivot)
        {
            i++;

            //swap arr[i] and arr[j]
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    //swap arr[i+1] and arr[end] (or pivot)
    int temp=arr[i+1];
    arr[i+1]= arr[end];
    arr[end]=temp;

    return i+1;
}

  public void PrintArray(int [] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
   System.out.println();
  }
}