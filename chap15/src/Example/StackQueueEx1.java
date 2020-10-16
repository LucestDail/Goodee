package Example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Stack : LIFO 자료형식(Last In, First Out)
 * 	 - Stack 클래스 : Vector 클래스의 서브 클래스. Lisst 객체임
 * 	push(Object o) : o 객체를 stack 에 추가
 * 	Object pop() : stack 객체를 꺼내고 반환
 * 	Object peek() : Stack 객체 반환,(꺼내는 것이 아님!)
 * Queue : FIFO 자료형식(First In, First Out)
 * 	 - Queue 인터페이스 : LinkedList 구현클래스
 * 	offer(Object o) : 객체를 queue 에 추가
 * 	Object poll() : 객체를 꺼내서 반환
 * 	Object peek() : 객체를 반환(꺼내는것 아님!)
 * @author GDJ30
 *
 */
public class StackQueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = {"소나타", "그랜저","SM5","K9"};
		Stack<String> stack = new Stack<>();
		for(String s : cars) {
			stack.push(s);
		}
		System.out.println("스택 입니다......");
		System.out.println("스택에 저장된 객체 갯수 : " + stack.size());
		System.out.println(stack.peek());
		System.out.println("스택에 저장된 객체 갯수 : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체 갯수 : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체 갯수 : " + stack.size());
		
		
		System.out.println("큐 입니다......");
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			queue.offer(s);
		}
		System.out.println("스택에 저장된 객체 갯수 : " + queue.size());
		System.out.println(queue.peek());
		System.out.println("스택에 저장된 객체 갯수 : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("스택에 저장된 객체 갯수 : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("스택에 저장된 객체 갯수 : " + queue.size());
		
	}

}
