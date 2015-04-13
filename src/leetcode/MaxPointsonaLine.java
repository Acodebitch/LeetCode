package leetcode;
import java.util.*;
// it is a wrong answer
class Point {
  int x;
  int y;
  Point() { x = 0; y = 0; }
  Point(int a, int b) { x = a; y = b; }
}
public class MaxPointsonaLine {
public int maxPoints(Point[] points) {
     HashMap<List<Float>,Integer> hm = new HashMap<List<Float>,Integer>();
     List<Point> list = new ArrayList<Point>();
     int num = 0;
     if(points.length==0||points.length==1)
    	 	return points.length;
     float MAX = 65536;
     if(points[0].x==points[1].x)
     {
    	 	list.add(points[0]);
    	 	list.add(points[1]);
    	 	List<Float> alist= new ArrayList<Float>();
    	 	alist.add((float)points[0].x);
    	 	alist.add(MAX);
    	 	hm.put(alist, 2);
    	 	num = num>hm.get(alist)?num:hm.get(alist);
     }
     else
     {
    	 	float k = (float)(points[1].y-points[0].y)/(float)(points[1].x-points[0].x);
    	 	float b = points[1].y-k*points[1].x;
    	 	list.add(points[0]);
    	 	list.add(points[1]);
    	 	List<Float> alist= new ArrayList<Float>();
    	 	alist.add(k);
    	 	alist.add(b);
    	 	System.out.println(alist);
    	 	hm.put(alist,2);
    	 	num = num>hm.get(alist)?num:hm.get(alist);
    	 }
     for(int i=2;i<points.length;i++)
     {
    	 	int Anumber = 0;
    	 	int Bnumber = 0;
    	 	for(int j=0;j<list.size();j++)
    	 	{
    	 		if(points[i].x == list.get(j).x)
    	 		{
    	 			Anumber++;
    	 			if(Anumber<=1)
    	 			{
    	 			List<Float> insidelist= new ArrayList<Float>();
    	    	 		insidelist.add((float)points[0].x);
    	    	 		insidelist.add(MAX);
    	    	 		if(hm.containsKey(insidelist))
    	    	 		{
    	    	 			int curNum = hm.get(insidelist)+1;
    	    	 			hm.put(insidelist,curNum);
    	    	 			num = num>curNum?num:curNum;
    	    	 		}
    	    	 		else
    	    	 		{
    	    	 			hm.put(insidelist,2);
    	    	 		}
    	 		}
    	 		}
    	 		else
    	 		{
    	 		float k = (float)(points[i].y- list.get(j).y)/(float)(points[i].x-list.get(j).x);
    	 		float b = list.get(j).y-k*list.get(j).x;
    	 		List<Float> insidelist= new ArrayList<Float>();
        	 	insidelist.add(k);
        	 	insidelist.add(b);
        	 	System.out.println(insidelist);
        	 	if(hm.containsKey(insidelist))
    	 		{
        	 		Bnumber++;
        	 		if(Bnumber<=1)
        	 		{
    	 			int curNum = hm.get(insidelist)+1;
    	 			
    	 			hm.put(insidelist,curNum);
    	 			num = num>curNum?num:curNum;
        	 		}
    	 		}
        	 	else
    	 		{
    	 			hm.put(insidelist,2);
    	 		}
        	 	
    	 		}
    	 	}
    	 	list.add(points[i]);
     }
     
     
     return num;
    }
public static void main(String[] args)
{
	MaxPointsonaLine ml = new MaxPointsonaLine();
	Point[] p = {new Point(3,1),new Point(12,3),new Point(3,1)};
	System.out.println(ml.maxPoints(p));
	
}
}
