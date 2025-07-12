package Arrays;

public class findMax {
	public static void main(String[] args) {
		 int[] arr = {8, 3, 11, 7};
		 int max= arr[0];
		 for(int i :arr) {
			 if(i>max) {
				 max=i;
			 }
		 }
		 System.out.println(max);
		 
		 int second=0;
		 for(int i:arr) {
			 if(i>max) {
				 second=max;
				 max=i;
			 }
			 else if (i!=max){
				 System.out.println(i);
			 }
		 }
		 System.out.println();
	}
}
