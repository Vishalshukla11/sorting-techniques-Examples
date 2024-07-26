package BubbleSorting;
class BubbleSortStudentScores
{
    public static void main(String args[])
    {
        int [] scores= {80,50,60,90,55,75};
       bubbleSort(scores); //call the bubblesort method to sort the score 
         printArray(scores);// call the perintArray method to print the score 
    }

    static void bubbleSort(int [] arr)
    {
        int n= arr.length; //get the length of the array 
        for(int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
            //method to print the element of the array

            static void printArray(int [] arr)
            {
                int n=arr.length;
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
            }
}