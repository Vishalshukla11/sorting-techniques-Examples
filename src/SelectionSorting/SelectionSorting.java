package SelectionSorting;
class SelectionSorting
{
    
public static void main(String args[])
{
    
    int [] arr={10,50,20,35,50};
    int temp=0,ele;
    for(int i=0;i<arr.length;i++)
    {   
        ele=i;
        for(int j=i+1;j<arr.length;j++)
        {
           if(arr[j]< arr[ele])
           {
              ele=j;
           }
           System.out.println("ele valur " + ele);
        }
        temp=arr[i];
        arr[i]=arr[ele];
        arr[ele]=temp;
    }

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+ " ");
    }
}
}