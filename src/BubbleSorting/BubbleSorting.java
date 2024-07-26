package BubbleSorting;
class BubbleSorting
{
  public static void main(String args[])
  {
    int temp=0;
    int [] arr= {10,20,30,40,50,60,70};
   

    for(int i=0;i<arr.length ;i++)
    { 
        
        for(int j=0;j<arr.length-1-i;j++)
        { int flag=0;
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             flag=1;
            }
            if(flag==0)
            {
                break;
            }
            
        }
        
    }
    for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
      
  }
}