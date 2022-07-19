package customexceptions;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
		
		//throw new UncheckedCustomExceptions("No se pudo");
			throw new CheckedCustomException("Este si se personaliza");
		
		}

}
