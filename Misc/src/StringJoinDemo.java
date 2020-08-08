import java.util.ArrayList;
import java.util.List;

public class StringJoinDemo {

	public static void main(String[] args) {
		List<String> regions = new ArrayList<>();
		regions.add("APAC");
		regions.add("NAMR");
		regions.add("EMEA");
		StringBuilder sb = new StringBuilder();
		sb.append("'");
		String regionsJoined = String.join("','", regions);
		sb.append(regionsJoined);
		sb.append("'");
		System.out.println(sb.toString());
		regions.forEach(s->System.out.println(s));

	}

}
