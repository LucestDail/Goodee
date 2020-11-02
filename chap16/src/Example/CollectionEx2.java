package Example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student3{
	private String name;
	private boolean isMale;
	private int grade;
	private int ban;
	private int score;
	Student3(String name, boolean isMale, int grade, int ban, int score){
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public boolean isMale() {
		return isMale;
	}
	public int getGrade() {
		return grade;
	}
	public int getBan() {
		return ban;
	}
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return String.format("[%s, %s, %d grade, %d class, %3d point]", name, isMale?"male" : "female", grade, ban ,score);
	}
	
	enum Level{
		HIGH,
		MID,
		LOW
	}
}

public class CollectionEx2 {
	public static void main(String[] args) {
		Student3[] stuArr = {
			new Student3("njv",true,1,1,300),
			new Student3("kjv",false,1,1,250),
			new Student3("khd",false,1,2,200),
			new Student3("nhd",true,1,2,150),
			new Student3("khd",true,2,1,300),
			new Student3("bch",false,2,1,250),
			new Student3("ksg",false,2,2,200),
			new Student3("kmr",true,2,2,150),	
			new Student3("ksg",false,2,3,300),	
			new Student3("nmr",true,2,3,270)
		};
		System.out.println("1. gender distinct =========");
		Map<Boolean, List<Student3>> studentDistinctByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Student3::isMale));
		System.out.println("Male==============");
		for(Student3 student : studentDistinctByGender.get(true)) {
			System.out.println(student);
		}
		System.out.println("Female============");
		for(Student3 student : studentDistinctByGender.get(false)) {
			System.out.println(student);
		}
		
		System.out.println("2. gender distinct counting =========");
		Map<Boolean, Long> studentDistinctByGenderCount = Stream.of(stuArr).collect(Collectors.partitioningBy(Student3::isMale,Collectors.counting()));
		studentDistinctByGenderCount.forEach((k,v) -> System.out.println("gender : " + k + ", info : " + v));
		System.out.println("male : " + studentDistinctByGenderCount.get(true));
		System.out.println("female : " + studentDistinctByGenderCount.get(false));
		
		System.out.println("3. gender distinct optional =========");
		Map<Boolean, Optional<Student3>> studentScoreOptionalByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Student3::isMale, Collectors.maxBy(Comparator.comparingInt(Student3::getScore))));
		System.out.println("male max score : " + studentScoreOptionalByGender.get(true).get());
		System.out.println("male max score : " + studentScoreOptionalByGender.get(false).get());
		
		
		
		System.out.println("1-1. grade distinct =========");
		Map<Boolean, List<Student3>> studentDisntinctByGrade = Stream.of(stuArr).collect(Collectors.partitioningBy(s->s.getGrade()==1));
		System.out.println("1 grade ==============");
		for(Student3 student : studentDisntinctByGrade.get(true)) {
			System.out.println(student);
		}
		System.out.println("1-2.  grade============");
		for(Student3 student : studentDisntinctByGrade.get(false)) {
			System.out.println(student);
		}
		
		System.out.println("1-2. class distinct =========");
		Map<Integer, List<Student3>> studentDisntinctByClass = Stream.of(stuArr).collect(Collectors.groupingBy(s->s.getBan()));
		studentDisntinctByClass.forEach((k,v) -> System.out.println("class : " + k + ", counting : " + v));
		
	}

}
