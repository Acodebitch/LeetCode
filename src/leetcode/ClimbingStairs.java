package leetcode;
// finish, it is so easy
public class ClimbingStairs {
	public int climbStairs(int n){
        int map[] = new int[n + 1];
        return climbStairs(n , map);
    }

    public int climbStairs(int n, int[] map){
        if(n <= 2){
            map[n] = n;
            return map[n];
        }
        if(map[n] == 0){
            map[n] = climbStairs(n - 1, map) + climbStairs(n - 2, map);
        }
        return map[n];
    }
}
