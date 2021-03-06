import java.util.*;

class Member {
	private int index;
	private int prior;

	Member(int prior, int index) {
		this.prior = prior;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public int getPrior() {
		return prior;
	}
}

public class PrinterSolution {

	public static int solution(int[] priorities, int location) {
		
		Queue<Member> queue = new LinkedList<>();
		int[] priorNum = new int[9];
		int maxPrior = 0;
		int index = 0;
		int myIndex = location;
		int myPrior = 0;
		int printCounter = 0;
		for (int i = 0; i < priorities.length; i++) {
			if(i == myIndex) {
				myPrior = priorities[i];
			}
			if (maxPrior < priorities[i]) {
				maxPrior = priorities[i];
			}
			priorNum[priorities[i]-1]++;
			queue.add(new Member(priorities[i],index++));
		}
//		for(Member item : queue) {
//			System.out.println(item.getIndex() + " : " + item.getPrior());
//		}
		System.out.println("myPrior and index : " + myIndex +" : " + myPrior);
		index = 0;
		int queueSize = queue.size();
		for(int i = maxPrior; i > 0;i--) {
			for(index = 0; index < queueSize; index++) {
				System.out.println("current max Prior : " + i + "left num : " + priorNum[i-1]);
				if(priorNum[i-1] == 0) {
					System.out.println("left num is empty go to next step");
					break;
				}
				if(queue.peek().getPrior() == i) {
					printCounter++;
					if(queue.peek().getPrior() == myPrior && queue.peek().getIndex() == myIndex) {
						System.out.println("Found my num! searching ended");
						return printCounter;
					}
					System.out.println(queue.peek().getIndex() + "has been out, prior : " + queue.peek().getPrior());
					queue.poll();
					queueSize--;
					index--;
					priorNum[i-1]--;
				}else{
					System.out.println(queue.peek().getIndex() + "has been repush, prior : " + queue.peek().getPrior());
					queue.add(queue.poll());
				}
				for(Member item : queue) {
					System.out.println(item.getIndex() + " : " + item.getPrior());
				}
			}
			for(Member item : queue) {
				System.out.println(item.getIndex() + " : " + item.getPrior());
			}
			System.out.println();
		}
		
		return printCounter;
	}

}
