package practiceAlgo;

public class CharOccurnace {

	public static void main(String[] args) {
		
		  int MAX_CHAR = 256; 
		  
	        int count[] = new int[MAX_CHAR]; 
	        String str = "prabhatprabhat";

	        	int n = str.length();
	        	for (int i = 0; i < n; i++) 
		            count[str.charAt(i)]++; 
	        	
	        	 char ch[] = new char[str.length()]; 
			        for (int i = 0; i < n; i++) { 
			            ch[i] = str.charAt(i); 
			            int find = 0; 
			            for (int j = 0; j <= i; j++) { 
			                if (str.charAt(i) == ch[j])  
			                    find++;                 
			            } 
			  
			            if (find == 1)  
			                System.out.println("Number of Occurrence of " + 
			                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
			        } 
	        	
	        
		
		
		
		
}
}
