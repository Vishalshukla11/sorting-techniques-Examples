package MergeSort;

class MergeSortExample{
public static void main(String args[])
{
    int num []= {2,5,3,10,7,20,6,99,55};
    int l=num.length;
    mergeSort(num, 0, l-1);
    printArray(num);

}

    // merge sort function with start and end indices 
    static void mergeSort(int[] arr,int start,int end )
    {
        if(start< end)
        {
            int mid=(start+end)/2;// calculate the middle index
            mergeSort(arr, start, mid); //sort the left half
            mergeSort(arr, mid+1, end);  // sort the right half
             merge(arr, start, mid, end);
        }
    }

    //function to merge two halves
    static void merge(int[]arr,int start,int mid,int end)
    {
        //size of two subArrays to be merge 
        int n1=mid - start+1;
        int n2= end-mid;

        //temporary arrays
        int[] leftArray=new int[n1];
        int[] rightArray= new int[n2];
        
        //copy data to temporary addays 

        for(int i=0; i<n1;i++)
        {
            leftArray[i]=arr[start+i];
        }
        for(int j=0;j<n2;j++)
        {
            rightArray[j]=arr[mid+1 + j];
        }

        //Initial indexes of the first and second subarrays 
        int i=0, j=0;

        //Initial index of merged subArray
        int k=start;

        //merge the temporary arrays
        while(i<n1 && j<n2)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of the left arrays if any 
        while(i<n1)
        {
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        //copy remaning elements of rightArray if any 
        while(j<n2)
        {
            arr[k]=rightArray[j];
            j++;
            k++;
        }

    }

    static void printArray(int [] arr)
    {
        for(int value: arr)
        {
            System.out.print(value+ " ");
        }
        System.out.println();
    }

}