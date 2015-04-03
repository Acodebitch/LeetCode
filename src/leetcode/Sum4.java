package leetcode;
import java.util.*;
import java.util.Map.Entry;

// This is the 4 sum problem under the hash table label
public class Sum4 {
// This is the original thought, it is easy to implement but its complexity is O(4)
//public List<List<Integer>> fourSum(int[] num,int target)
//{
//	ArrayList<List<Integer>> list = new ArrayList<List<Integer>> ();
//	for(int i=0;i<num.length;i++)
//		for(int j=i+1;j<num.length;j++)
//			for(int k =j+1;k<num.length;k++)
//				for(int l = k+1;l<num.length;l++)
//				{
//					ArrayList<Integer> insideList = new ArrayList<Integer>(); 
//					if(num[i]+num[j]+num[k]+num[l]==target)
//					{
//						insideList.add(num[i]);
//						insideList.add(num[j]);
//						insideList.add(num[k]);
//						insideList.add(num[l]);
//						Collections.sort(insideList);
//						list.add(insideList);
//					}
//				}
//	return list;
//	
//}
//to do: 这个方法我感觉是不错的，但竟然惨遭超时
//public List<List<Integer>> fourSum(int num[],int target)
//{	List<List<Integer>> ls = new ArrayList<List<Integer>>();
//	HashMap<List<Integer>,Integer> hs1 = new HashMap<List<Integer>,Integer>();
//	for(int i=0;i<num.length;i++)
//		for(int j=i+1;j<num.length;j++)
//		{
//			ArrayList<Integer> keyList = new ArrayList<Integer>();
//			keyList.add(i);
//			keyList.add(j);
//			hs1.put(keyList,num[i]+num[j]);
//		}
//	for(Entry<List<Integer>,Integer> entry1:hs1.entrySet())
//		for(Entry<List<Integer>,Integer> entry2:hs1.entrySet())
//		{
//			if(entry1.getKey() == entry2.getKey())
//				continue;
//			if(entry1.getValue() + entry2.getValue()==target)
//			{
//				List<Integer> list = new ArrayList<Integer>(){{add(num[entry1.getKey().get(0)]);add(num[entry1.getKey().get(1)]);add(num[entry2.getKey().get(0)]);add(num[entry2.getKey().get(1)]);}};
//				Collections.sort(list);
//				if(!ls.contains(list))
//				ls.add(list);
//			}
//		}
//	return ls;
//}
// this is an O(3) function it is pretty easy.
// public List<List<Integer>> fourSum(int[] num,int target)
// {
//	 List<List<Integer>> list = new ArrayList<List<Integer>>();
//	 Arrays.sort(num);
//	 for(int i=0;i<num.length;i++)
//	 {
//		 for(int j=i+1;j<num.length;j++)
//		 {
//			 int m = j+1;
//			 int n = num.length-1;
//			 int temp = target - num[i] - num[j];
//			 while(m<n)
//			 {
//				 if(num[m]+num[n]==temp)
//				 {
//					 ArrayList<Integer> l = new ArrayList<Integer>();
//					 l.add(num[i]);
//					 l.add(num[j]);
//					 l.add(num[m]);
//					 l.add(num[n]);
//					 if(!list.contains(l))
//						 list.add(l);
//					 m++;
//					 n--;
//				 }
//				 else if(num[m]+num[n]<temp)
//					 m++;
//				 else
//					 n--;
//			 }
//			 
//		 }
//		 
//	 }
//	 return list;
// }
	public List<List<Integer>> fourSum(int[] num,int target)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(num.length<4)
			return result;
		Arrays.sort(num);
		HashMap<Integer, List<List<Integer>>> hs= new HashMap<Integer, List<List<Integer>>>();
		for(int i=0;i<num.length;i++)
			for(int j=i+1;j<num.length;j++)
			{
				int temp = target - num[i]-num[j];
				if(hs.containsKey(temp))
				{
					for(List<Integer> ls :hs.get(temp))
					{
						List<Integer> list = new ArrayList<Integer>();
						list.add(ls.get(0));
						list.add(ls.get(1));
						list.add(num[i]);
						list.add(num[j]);
						if(ls.get(1)<num[i] && !result.contains(list))
						{
							result.add(list);
						}
					}
				}
				if(hs.containsKey(num[i]+num[j]))
				{
					List<Integer> l = new ArrayList<Integer>();
					l.add(num[i]);
					l.add(num[j]);
					hs.get(num[i]+num[j]).add(l);
					
				}
				else
				{
					List<Integer> l = new ArrayList<Integer>();
					l.add(num[i]);
					l.add(num[j]);
					List<List<Integer>> theList = new ArrayList<List<Integer>>();
					theList.add(l);
					hs.put(num[i]+num[j], theList);
				}
					
			}
		return result;
	}
public void show(List<List<Integer>> list)
{
	Iterator<List<Integer>> it = list.iterator();
	while(it.hasNext())
	{
		Iterator<Integer> insiderit = it.next().iterator();
		while(insiderit.hasNext())
		{
			System.out.print(insiderit.next());
		}
		System.out.println();
	}
}
public static void main(String[] args)
{
	int []num = {1,0,-1,0,-2,2};
	int target = 0;
	Sum4 sum = new Sum4();
	sum.show(sum.fourSum(num, target));
	
}
}
