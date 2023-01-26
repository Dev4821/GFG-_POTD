class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
   int ll=0;
   int ul=0;
   
   
   for(int i=0;i<str.length();i++)
   {
       if(Character.isLowerCase(str.charAt(i)))
       {
           ll++;
       }
       else
       {
           ul++;
       }
   }
   
     char[] lower=new char[ll];
     char[] upper=new char[ul];
   char[] Array = new char[str.length()]; 
     for(int i=0,j=0,k=0;i<str.length();i++)
   {
       if(Character.isLowerCase(str.charAt(i)))
       {
           lower[j]=str.charAt(i);
           j++;
       }
       else
       {
           upper[k]=str.charAt(i);
           k++;
       }
   }
   Arrays.sort(lower);
   Arrays.sort(upper);
   for(int i=0,j=0,k=0;i<str.length();i++)
   {
      if(Character.isLowerCase(str.charAt(i))) 
      {
          Array[i]=lower[j];
          j++;
      }
      else
      {
          Array[i]=upper[k];
          k++;
      }
   }
  return new String(Array);
       }
}
