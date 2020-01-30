package practiceAlgo;

public class AlgoPractice {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		int[] n={2,5,1,9,5,3};
		int[] m= new int[6];
		
		int a=n.length-1;
		
		
		for(int i=0;i<a;i++)
			for(int j=i+1;j<a;j++){
				
				if(n[i]>n[j]){
					int temp =n[i];
					n[i]=n[j];
					n[j]=temp;
				}		
			}
		for(int k=0;k<a;k++)
		{
			System.out.println(n[k]);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	}
	
