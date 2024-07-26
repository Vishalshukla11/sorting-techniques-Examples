class ArrayAnonymous
{
  public static void main(String args[])
  {

    // onle once we can use this Anonymus and there is a no name i=of this kind of arrays
       ArrayAnonymous.sum(new int[]{1,2,3,4,5});
  }   

  public static void sum(int [] ele)
  {
      int total=0;
      for(int i : ele)
      {
        total+=i;
      }
      System.out.println(total);
  }
}