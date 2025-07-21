package booklet;

public class secondMaxNmin {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int max=arr[0],min=arr[0],secondMax =0,secondMin=0;int SecMaxindex=0,SecMinIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
				SecMaxindex=i;
				
			}
			else if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
				SecMinIndex=i;
			}
		}
		System.out.println(secondMax);
		System.out.println(SecMaxindex);
		System.out.println(secondMax);
		System.out.println(SecMinIndex);
	}
}


//you're only updating the secondMax when you find a new maximum, 
//and the same logic applies to secondMin. But that doesn’t account for a situation 
//where the second-largest or second-smallest element appears before the maximum or minimum in the array.



//To avoid this problem find second max and secon min separatelyh and thn find index