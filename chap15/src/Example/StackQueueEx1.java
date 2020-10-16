package Example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Stack : LIFO �ڷ�����(Last In, First Out)
 * 	 - Stack Ŭ���� : Vector Ŭ������ ���� Ŭ����. Lisst ��ü��
 * 	push(Object o) : o ��ü�� stack �� �߰�
 * 	Object pop() : stack ��ü�� ������ ��ȯ
 * 	Object peek() : Stack ��ü ��ȯ,(������ ���� �ƴ�!)
 * Queue : FIFO �ڷ�����(First In, First Out)
 * 	 - Queue �������̽� : LinkedList ����Ŭ����
 * 	offer(Object o) : ��ü�� queue �� �߰�
 * 	Object poll() : ��ü�� ������ ��ȯ
 * 	Object peek() : ��ü�� ��ȯ(�����°� �ƴ�!)
 * @author GDJ30
 *
 */
public class StackQueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = {"�ҳ�Ÿ", "�׷���","SM5","K9"};
		Stack<String> stack = new Stack<>();
		for(String s : cars) {
			stack.push(s);
		}
		System.out.println("���� �Դϴ�......");
		System.out.println("���ÿ� ����� ��ü ���� : " + stack.size());
		System.out.println(stack.peek());
		System.out.println("���ÿ� ����� ��ü ���� : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü ���� : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü ���� : " + stack.size());
		
		
		System.out.println("ť �Դϴ�......");
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			queue.offer(s);
		}
		System.out.println("���ÿ� ����� ��ü ���� : " + queue.size());
		System.out.println(queue.peek());
		System.out.println("���ÿ� ����� ��ü ���� : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("���ÿ� ����� ��ü ���� : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("���ÿ� ����� ��ü ���� : " + queue.size());
		
	}

}
