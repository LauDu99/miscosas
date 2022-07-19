
public class LabelledBlock {
	public static void main(String[] args) {
		
		int x =20;
		
		l1:{
			System.out.println("Block begins");
			if(x==20) {
				break l1;
			}
			System.out.println("block ends");
		}
		
		System.out.println("outside the block");
	}
}
