
public class ArrayDemo {

	public static void main(String[] args) {
		//int arr[5];
		
		//int arr[] = {10,20,30,40,50};
		
		int arr[] = new int[5];
		arr[0]=10;
		arr[1]= new Integer(20);
		//arr[2] = 30, 40;
		
		arr[2] =30;
		//arr[2]= 30,54;
		
		System.out.println("Elemnts of the array:");
		//le das la identidad al elemento en este caso arr
		for(int element : arr) {//convierto los campos en elementos, solo puede ser lineal no inverso
			System.out.println(element);
		}
//		for(int i=0; i<arr.length;i++)
//			System.out.println(arr[i]);
		float[] arr1 = new float[4];
		
		for(float element: arr1) {
			System.out.println(element);
		}
		
	}

}
