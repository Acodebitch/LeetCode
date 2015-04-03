package leetcode;

import java.util.Stack;

class MinStack {
	   private static Stack<Integer> OStack = new Stack<Integer>();
		private static Stack<Integer> MStack = new Stack<Integer>();

		public static void push(int x)
		{
			OStack.push(x);
			if (MStack.isEmpty() || x <= MStack.peek())
				MStack.push(x);
		}

		public static void pop()
		{
			int pos1 = 0;
			int pos2 = 0;
			if (OStack.isEmpty())
			{
			} else
			{
				
				pos1 = OStack.size() - 1;
				int peek = OStack.peek();
				if ( peek== MStack.peek())
				{
					pos2 = MStack.size() - 1;
					MStack.remove(pos2);
				}
				OStack.remove(pos1);
			}
		}

		public static int top()
		{
			if (OStack.isEmpty())
			{
				return -1;
			} else
			{
				return OStack.peek();
			}
		}

		public static int getMin()
		{
			if (MStack.isEmpty())
			{
				return -1;
			} else
			{
				return MStack.peek();
			}
		}
	
public static void main(String[] args)
{
//	push(512);
//	push(-1024);
//	push(-1024);
//	push(512);
//	pop();
//	System.out.println(getMin());
//	pop();
//	System.out.println(getMin());
//	pop();
//	System.out.println(getMin());
	push(-1);
	top();
	System.out.println(getMin());
}
}