package leetcode;
import java.util.*;
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
	    List<String> res = new ArrayList<String>();
	    if(0 == n)
	        return res;
	    int l = n;
	    int r = n;
	    String item = new String();
	    putIn(l,r,item,res);
	    return res;
	}
	public void putIn(int l, int r, String item, List<String> res)
	{
	    if(l==0 && r==0)
	    {
	        res.add(item);
	        return;
	    }
	    if(l>0)
	        putIn(l-1,r,item+"(",res);
	    if(r>l)
	        putIn(l,r-1,item+")",res);
	}
}
