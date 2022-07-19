
public class Grade {

	public static void main(String[] args) {
		int Mat=35, Chem=40, Physic=90;
		if(Mat>35 & Chem>35 & Physic>35) {
			System.out.println("Pasaste Todas");
		}else if(Chem>35 & Physic >35){
			System.out.println("Pasaste Fisica y Quimica");
		}else if(Mat>35 & Physic>35) {
			System.out.println("Pasaste Mate y fisica");
		}else {
			System.out.println("Reprobaste");
		}
		
		
		int Mate=35, Chemy=40, Physics=90;
		int promedio = (Mate+Chemy+Physics)/3;
		
		if(promedio<=59) {
			System.out.println("Your grade is C");
		}else if(promedio<=69){
			System.out.println("Your grade is B");
		}else {
			System.out.println("Your grade is A!");
		}
	}

}
