import java.util.Iterator;

public class ArrayIndexOOBDemo {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		
		try {
		
			System.out.println("Elements inside the array");
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);// error porque estamos yendo más allá de el array
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Beyond array lenght");
		}
		System.out.println("after array output");
	}

	void method1() {
		System.out.println("method1");
	}
}
