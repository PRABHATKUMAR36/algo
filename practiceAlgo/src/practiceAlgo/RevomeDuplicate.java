package practiceAlgo;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RevomeDuplicate {

	public static void main(String[] args) {
		

		int[] n={2,5,1,9,5,3,9,8,7,6,5,4,3,21,2,1,1,5};
		Integer [] m= new Integer[]{6,9,3,5,1,6,2,9,1};
		
		int a=n.length-1;
		
		
		for(int i=0;i<a;i++)
			for(int j=i+1;j<a;j++){
				
				if(n[i]>n[j]){          //swipe logic
					int temp =n[i];
					n[i]=n[j];
					n[j]=temp;
				}		
			}
		for(int k=0;k<a;k++)
		{
			System.out.println(n[k]);
		}
		
		Integer[] boxedArray = Arrays.stream(n) // IntStream boxint int[] to Integer[]
				.boxed()				// Stream<Integer>
				.toArray(Integer[]::new);

           System.out.println(Arrays.toString(boxedArray));
	
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(boxedArray) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
		
		
	}

}
