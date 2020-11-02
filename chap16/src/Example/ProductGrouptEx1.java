package Example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry;
public class ProductGrouptEx1 {
	public static void main(String[] args) throws IOException {
		ProductGrouptEx1 pg = new ProductGrouptEx1();
		Stream<Car> car = pg.makeCar();
		Map<Integer, List<Car>> map = car.collect(Collectors.groupingBy(s -> s.getMonth()));
		map.forEach((k, v) -> {
			for (Car c : v) {
				System.out.println("month: " + k + " car: " + c);
			}
		});
		System.out.println(map);
		for(Map.Entry<Integer, List<Car>> e : map.entrySet()) {
			System.out.println(e.getKey() + " month sales value====================");
			for(Car c : e.getValue())
				System.out.println(c);
		}
		
		System.out.println("montly sales value");
		for(Map.Entry<Integer, List<Car>> e : map.entrySet()) {
			System.out.println(e.getKey() + " month : "+ e.getValue().size() + "case");
		}
		
		Map<Integer, Long> mapCount = pg.makeCar().filter(s -> s.getCon() == 2).collect(Collectors.groupingBy(s->s.getMonth(),Collectors.counting()));
		for(Map.Entry<Integer,Long> e : mapCount.entrySet()) {
			System.out.println(e.getKey() + "manth : "+ e.getValue() + " case");
		}
		
		System.out.println("montly sales whole value");
		Map<Integer, Integer> mapSum = pg.makeCar().filter(s -> s.getCon() == 2).collect(Collectors.groupingBy(s->s.getMonth(),Collectors.summingInt(Car::getQty)));
		for(Map.Entry<Integer,Integer> e : mapSum.entrySet()) {
			System.out.println(e.getKey() + "manth : "+ e.getValue() + " case");
		}
		
		System.out.println("car rollback value");
		Map<String, Integer> mapSumRollbackByCar = pg.makeCar()
				.filter(s -> s.getCon() == 3)
				.collect(Collectors
						.groupingBy(s->s.getCar(),Collectors.summingInt(Car::getQty)));
		for(Map.Entry<String, Integer> e : mapSumRollbackByCar.entrySet()) {
			System.out.println(e.getKey() + " type : "+ e.getValue() + " case");
		}
	}
	private Stream<Car> makeCar() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		Stream<Car> car = br.lines()
				.map(s -> {
					String[] str = s.split(",");
					String temp = "";
					try {
						temp = str[4];
					} catch (ArrayIndexOutOfBoundsException e) {}
					return new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1]), str[2],
							Integer.parseInt(str[3]), temp);
				});
		return car;
	}
}