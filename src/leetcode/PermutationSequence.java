package leetcode;

// use a wrong method to get time exceed
public class PermutationSequence {
String s1;
int num;
int [] array;
public String getPermutation(int n, int k) {
    int sum = 1,j=n;
    while(j>1)
    {
    		sum*=j;
    		j--;
    }
	if(k<=0||k>=sum)
    		return null;
	s1 = new String();
	num = 0;
    array = new int[1+n];
    for(int i=1;i<=n;i++)
    {
    	array[i] = i;
    }
	BackTrack(1,n,"",k);
	return s1;
    }
public void swap(int i,int j)
{
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}
public void BackTrack(int i,int n,String s,int k)
{
	if(i==n+1)
	{
		num++;
		if(num==k)
			s1 = s;
			
	}
	else
	{
		for(int j=i;j<=n;j++)
		{
			if(num==k) return;
			swap(i,j);
			BackTrack(i+1,n,s+(char)(array[i]+48),k);
			if(num==k) return;
			swap(j,i);
		}
	}
}
public static void main(String[] args)
{
	PermutationSequence ps = new PermutationSequence();
	System.out.println(ps.getPermutation(9, 278082));
}
}
