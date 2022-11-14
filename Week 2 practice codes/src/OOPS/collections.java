package OOPS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

public class collections {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.add(1, 6);
		System.out.println(list);

		LinkedList<Integer> list1 = new LinkedList<>();
		Stack<Double> s = new Stack<>();
		s.push(1.0);
		System.out.println(s);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(3);
		pq.add(1);
		System.out.println(pq.peek());

	}

}
