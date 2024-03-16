class FinalDeclare{
 //final static int SPEEDLIMIT; //cannot assign a value to final variable SPEEDLIMIT
  final int SPEEDLIMIT; 
  FinalDeclare()
  {
  	SPEEDLIMIT = 10;
  	System.out.println(SPEEDLIMIT);
  }
	
  public static void main(String args[]){
   	//new FinalDeclare();
	FinalDeclare fd= new FinalDeclare();
	System.out.println(fd.SPEEDLIMIT);
	//SPEEDLIMIT = 20;
	//System.out.println(SPEEDLIMIT);
 }
}