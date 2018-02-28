package class13;//2016.7.20 星期三pm.3

import java.util.Date;
import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("hello");
		s.push(new Date());
		s.push(400);    //自动封装，等价于s.push(new Integer(400));
		s.push(3.14);
		
		System.out.println("弹栈前：size=" + s.size());
//		pop是把栈里的数据拿出来，进行使用
		System.out.println(s.pop());
		System.out.println("弹栈前：size=" + s.size());
//		peek是使用栈尾的元素
		System.out.println(s.peek());
		System.out.println("弹栈前：size=" + s.size());
		while(!s.isEmpty())
			System.out.println(s.pop());

	}

}
