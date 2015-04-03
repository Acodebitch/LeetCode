package leetcode;

public class InterLeavingString {
public boolean isInterleave(String s1, String s2, String s3) {
	int s1num = s1.length(),s2num = s2.length(),s3num = s3.length();
	if(s1num+s3num!=s3num)
		return false;
	boolean [][] array = new boolean[s1num+1][s2num+1];
	array[0][0] = true;
	for(int i=1;i<=s1num;i++)
		array[i][0] = array[i-1][0]&&s3.charAt(i-1)==s1.charAt(i-1);
	for(int j=1;j<=s2num;j++)
		array[0][j] = array[0][j-1]&&s3.charAt(j-1)==s2.charAt(j-1);
	for(int i=1;i<=s1num;i++)
		for(int j=1;i<=s2num;j++)
		{
			array[i][j] = array[i-1][j]&&s3.charAt(i-1)==s1.charAt(i-1)||array[i][j-1]&&s3.charAt(j-1)==s2.charAt(j-1);
		}
		
	
	return array[s1num][s2num];
    }
}
