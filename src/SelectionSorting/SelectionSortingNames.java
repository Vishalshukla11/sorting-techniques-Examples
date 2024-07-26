package SelectionSorting;

class SelectionSortingNames
{
    public static void main(String args[])
    {
        String [] Names={"john","Alice","Bob","David","Charlie"};
         SelectionSortingNames s1= new SelectionSortingNames();
       s1.SelectionSort(Names);
       s1.printArray(Names);
    }

    public void SelectionSort(String[]arr)
    {
        int n=arr.length; // get the length of the array
        for(int i=0;i<n-1;i++) // outher loop to iterate over the array
        {
            int minIndex=i; // assume the current position is minium 
            for(int j=i+1; j<n;j++) // inner loop to find the min element in the unsorted part 
            {
                if(arr[j].compareTo(arr[minIndex])<0) // compare and update the minium index
                {
                    minIndex=j; // updat the index of the minium element 
                }
            }
            // swap the found minium element with the first element of the unsorted part
            String temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

    }

    public void printArray(String [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

}