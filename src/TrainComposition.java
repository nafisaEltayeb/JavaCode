import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
	
	private final Deque<Integer> deque = new LinkedList<>();
	
	public void attachWagonFromLeft(int wagonId) {
		deque.addFirst(wagonId);
	}
	
	public void attachWagonFromRight(int wagonId) {
		deque.addLast(wagonId);
	}
	
	public int detachWagonFromLeft() {
		final Integer wagon =deque.pollFirst();
		return wagon ==null? 0:wagon;
	}
	
	public int detachWagonFromRight() {
		final Integer wagon =deque.pollLast();
		return wagon == null? 0:wagon;
		
	}
	
	public static void main(String[] args) {
		TrainComposition tree = new TrainComposition();
		tree.attachWagonFromLeft(7);
		tree.attachWagonFromLeft(13);
		System.out.println(tree.detachWagonFromRight());
		System.out.println(tree.detachWagonFromLeft());
	}

}
