class FinalParameter
{  
  int cube(final int N)
  {  
   //N=N+2;
   return N*N*N;  
  }  
  public static void main(String args[])
 {  
    FinalParameter b=new FinalParameter();  
    System.out.println(b.cube(5));
 }  
} 