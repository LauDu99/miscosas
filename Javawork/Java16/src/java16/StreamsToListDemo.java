package java16;


import java.util.Arrays;
import java.util.List;

public class StreamsToListDemo {

	public static void main(String[] args) {

		List<String> ids = Arrays.asList("123","456","789");
		List<Integer> list = ids.stream().map(Integer::parseInt).toList();
	}

}
