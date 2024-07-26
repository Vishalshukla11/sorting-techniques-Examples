package LinearSearch;
class LinearSearchExample
{
    public static void main(String args[])
    {
        int [] arr= {10,55,15,25,20,5,17,22,33,66,7};
        int target =66;
        
        LinearSearchExample L1= new LinearSearchExample();
       int index = L1.linearSearch(arr, target);
       
       if(index!=-1)
       {
        System.out.println("Element " + target + " Found at index " + index);
       }
       else{
       System.out.println("Element " + target + " not found in array.");
       }
        
         

    }

    // linear search method to find target element in array 

    public  int linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i; // return index if found
            }
        }
        return -1;
    }
}