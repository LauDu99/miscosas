package bonusprogram;

public class CharReversal {

	public static void main(String[] args) {

		String s = "Java is Awesome!!";
		
		String[] temp = s.split(" ");
		int i =0;
		String result = "";
		while(i<temp.length) {
			result+= new StringBuffer(temp[i]).reverse().toString();
			i++;
			//creando espacios entre palabras
			if(i!=temp.length) {
				result+=" ";
			}
		}
		System.out.println(result);
	}
	

}
