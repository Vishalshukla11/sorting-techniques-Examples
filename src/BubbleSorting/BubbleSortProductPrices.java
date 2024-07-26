package BubbleSorting;
class BubbleSortProductPrices
{
    public static void main(String args[])
    {
        double [] pricees ={99.99,49.99,19.99,25.25,59.99,45};
       BubbleSortProductPrices b1= new BubbleSortProductPrices();
       b1.bubbleSorting(pricees);
       b1.printArray(pricees);

    }

    public void bubbleSorting(double [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
   public void printArray(double arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
   }
}
  