package leetcode;
import java.util.*;
public class GrayCode {
private List<Integer> list;
public List<Integer> grayCode(int n) {
        list = new ArrayList<Integer>();
        Backtrack(1,n,0);
        return list;
    }
public void Backtrack(int i,int n,int sum)
{
	if(i>n)
	{
		list.add(sum);
	}
	else
	{
		Backtrack(i+1,n,sum);
		Backtrack(i+1,n,(int)(sum+Math.pow(2, i-1)));
	}
}
public static void main(String[] args)
{
	GrayCode gc = new GrayCode();
	System.out.println(gc.grayCode(2));
}
}
