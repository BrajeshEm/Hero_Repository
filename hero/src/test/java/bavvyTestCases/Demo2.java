package bavvyTestCases;

import org.testng.annotations.Test;

public class Demo2 {

	
	String name = "123456";
	int len = name.length();
	String rev = "";
	
	String namee = " Brajesh ";
	
	
	@Test
	public void  demo() {
		// TODO Auto-generated method stub
		
		String s1 = "Transaction is currently in the queue for processing (Transaction Id - 431030)";
		 String s = "apple car 05";
	        System.out.println(s1.substring(0, 71));
	        
	        for(int i = len-1;i>=0;i--)
	        {
	        	rev =  rev+name.charAt(i);
	        }
             System.out.println(rev);
             System.out.println(s.replace(" ", ""));
             System.out.println(namee.trim());
	}
	

}
