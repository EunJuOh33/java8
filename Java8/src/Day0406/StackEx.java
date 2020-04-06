package Day0406;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		int num;
		try {
			num = stack.peek();
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("데이터가 없습니다.");
		}
		
		stack.push(10);
		stack.push(20);
		num = stack.peek();
		System.out.println(num);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	}
}
