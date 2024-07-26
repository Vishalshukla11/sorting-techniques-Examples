package BinarySearch;
class BinarySearchExample
{
    public static void main(String args[])
    {
        int [] number= {10,20,50,66,86,99,86};
        BinarySearchExample b1= new BinarySearchExample();
        int result = b1.binarySearch(number,20);
      if(result == -1)
      {
        System.out.println("Element not present in the array");
      }
      else{
        System.out.println("Element found at index " + result);
      }
    }
    



// method to perform the binary search 
public static int binarySearch(int [] arr,int target )
{
  int left=0;
  int right=arr.length-1;

  while(left<right)
  {
    int middle= left+(right-left)/2;

    //check if the target is present at the middle 
    if(arr[middle]==target)
    {
        return middle;
    }
    //if target is greater ,ignore the left half
    if(arr[middle]<target)
    {
        left=middle+1;
    }
          // if target is smaller ,ignore the right half 
    else{
        right=middle-1;
    }
  }

  //target is not present in the array 
  return -1;

}
}
