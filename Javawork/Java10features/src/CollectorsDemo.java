import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
	
		List<Integer> lis = List.of(15,20,30,17);
		//lista de valores inmutable
		List<Integer> list = lis.stream().filter(i->i%3==0).collect(Collectors.toUnmodifiableList());
	
	}

}
