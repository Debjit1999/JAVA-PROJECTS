
public class ArrayOperationMain {
 public static void main(String[] args) {
	 int[] arr1= {10,20,30,40,50,60,70,80,90,100};
	 int[] arr2=new int[arr1.length/2];
	 ArrayOperation operations=new ArrayOperation();
	 int[] result=operations.addAlternateElements(arr1, arr2);
	 System.out.println("The elements of first arrat are:");
	 for(int i=0;i<arr1.length;i++) {
	 System.out.print(arr1[i]+"");
	 }
	 System.out.println();
	 System.out.println("The Elements of second array are;");
	 for(int i=0;i<result.length;i++) {
		 System.out.print(result[i]+"");
	 }
 }
}
