package Example;

import java.util.function.Consumer;

class Member2 {
	private String name;
	private String id;
	private Address address;
	public Member2 (String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	
}

class Address{
	private String country;
	private String city;
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	
}

public class AndThenEx1 {
	public static void main(String[] args) {
		Consumer<Member2> conA = (m) -> {
			System.out.println("conA : " + m.getName());
		};
		Consumer<Member2> conB = (m) -> {
			System.out.println("conB : " + m.getId());
		};
		
		Consumer<Member2> conAB = conA.andThen(conB);
		conAB.accept(new Member2("ȫ�浿","hongkd", null));		
	}

}
