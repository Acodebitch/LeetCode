package leetcode;

import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict)
	{
		boolean [] array = new boolean[s.length()+1];
		array[0] = true;
		for(int i=1;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[j]&&dict.contains(s.substring(i, j)))
				{
				array[i] = true;
				break;
				}
			}
		}
		return array[s.length()];
	}
}
