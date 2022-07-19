import java.util.HashMap;
import java.util.List;

public class VarDemo {

	public static void main(String[] args) {

		//variable inferida
		//no puede ser un valor nulo, ni usarse en lambda ni a nivel clase
		var x =10;
		
		var map = new HashMap<String,List<String>>();
		for(var entry : map.entrySet()) {
			var value =entry.getValue();
		}
	}

}
