package BubbleSorting;
class BubbleSortingNames
{
   public static void main(String args[])
   {
    String [] names={"john", "Alice","Bob","David","Carlie"};
   BubbleSortingNames b2= new BubbleSortingNames();
   b2.BubbleSorting(names);
   b2.PrintArray(names);
}

   public void BubbleSorting(String[]arr)
   {
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(arr[j].compareTo(arr[j+1])>0)
            {
                String temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   }

   public void PrintArray(String [] arr)
   {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
   }
}