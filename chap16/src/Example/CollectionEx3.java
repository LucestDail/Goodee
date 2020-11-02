 package Example;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectionEx3 {

	public static void main(String[] args) {
		String[] strArr = {"aaa","bbb","ccc"};
		Stream<String> st = Stream.of(strArr);
		String result = st.collect(new ConcatCollector());
		System.out.println("result : " + result);
	}
}

class ConcatCollector implements Collector<String, StringBuilder, String>{

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		// TODO Auto-generated method stub
		System.out.println("accumulator()");
		return StringBuilder::append;
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		System.out.println("characteristics()");
		return Collections.emptySet();
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		// TODO Auto-generated method stub
		System.out.println("combiner()");
		return (sb,sb2) -> {sb.append(sb2);return sb;};
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		// TODO Auto-generated method stub
		System.out.println("finisher()");
		return sb -> sb.toString();
	}

	@Override
	public Supplier<StringBuilder> supplier() {
		// TODO Auto-generated method stub
		System.out.println("supplier()");
		return StringBuilder::new;
	}
	
}
