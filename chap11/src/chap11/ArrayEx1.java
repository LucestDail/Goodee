package chap11;

import java.util.Arrays;

class Value implements Comparable<Value>{
	int value;
	Value(int value){
		this.value = value;
	}
	
	@Override
	public int compareTo(Value o) {
		// TODO Auto-generated method stub
		return o.value - value;
	}

}

public class ArrayEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"����","�̸���","���","����"};
		for(String s : arr1) {
			System.out.print(s + ",");
		}
		
		System.out.println();
		Arrays.fill(arr1, "������");
		for(String s : arr1)
			System.out.print(s + ",");
		System.out.println();
		
		Arrays.fill(arr1, 1,3,"������");
		for(String s : arr1)
			System.out.print(s + ",");
		System.out.println();
		
		int[] intArr = new int[10];
		Arrays.fill(intArr, 10);
		for(int i : intArr)
			System.out.print(i + ",");
		System.out.println();
		
		String[] arr2 = {"����","�̸���","���","����"};
		Arrays.sort(arr2);
		
		for(String s : arr2)
			System.out.print(s + ",");
		System.out.println();
		
		intArr = new int[10];
		for(int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random()*10)+1;
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		Arrays.sort(intArr);
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		Value[] arr = {new Value(100),new Value(10),new Value(50)};
		for(Value item : arr) {
			System.out.print(item.value + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(Value item : arr) {
			System.out.print(item.value + " ");
		}
		System.out.println();
		
		String[] arrString = {"a","b","A","Z","a"};
		Arrays.sort(arrString);
		for(String s : arrString)
			System.out.print(s + " ");
		
		
		
	}

}
