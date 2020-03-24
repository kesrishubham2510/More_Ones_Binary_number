
public class Generate_Conditioned {

	private int len;
	
	Generate_Conditioned(int len)
	{
		this.len=len;  //initialising the length of binary number
	    char[] bits= new char[len];
	    int count_0=0,count_1=0;//to track the occurences of ones and zeroes 
	    
	   Generate_Conditioned_Numbers(bits,0,len,count_0,count_1);
	
	}
	
	private static void Generate_Conditioned_Numbers(char[] bits,int pos,int len,int count_0,int count_1)
	{
		//if at any stage no of zeroes exceed no of ones return
	   if(count_0>count_1)
		   return;
	   
	   //when the constructed binary number has required no. of bits 
	   if(pos==len)
	   {
		   if(bits[0]!='0')
			   System.out.println(bits);
		   return;
	   }
	   
	   bits[pos]='0';
	   Generate_Conditioned_Numbers(bits,pos+1,len,count_0+1,count_1);
	   
	   bits[pos]='1';
	   Generate_Conditioned_Numbers(bits,pos+1,len,count_0,count_1+1);
	   	   
	}
	
	
	
	
	
}


