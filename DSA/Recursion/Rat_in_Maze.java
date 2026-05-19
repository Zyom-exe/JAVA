package Recursion;
import java.util.*;
public class Rat_in_Maze {
    static List<String> findpath(int[][] maze, int n){
        List<String> ans= new ArrayList<>();
        int[][] vis= new int[n][n];
        for(int[] v:vis){
            Arrays.fill(v,0);
        }
        int[] di={+1,0,0,-1};
        int[] dj={0,-1,+1,0};
        solve(0,0,"",maze,n,vis,di,dj,ans);
        return ans;
    }

    private static void solve(int i, int j, String s, int[][] maze, int n, int[][] vis, int[] di, int[] dj, List<String> ans) {
        if(i==n-1 && j==n-1){
            ans.add(s);
            return;
        }
        String dir="DLRU";
        for(int index=0;index<4;index++){
            int nexti=i+di[index];
            int nextj=j+dj[index];
            if(nexti>=0&& nextj>=0&& nexti<n&&nextj<n && vis[nexti][nextj]!=1&& maze[nexti][nextj]==1){
                vis[nexti][nextj]=1;
                solve(nexti,nextj,s+(dir.charAt(index)),maze,n,vis,di,dj,ans);
                vis[nexti][nextj]=0;
            }
        }
    }

    public static void main() {
        int[][] maze={{1,1,0,},{1,1,1},{0,1,1}};
        System.out.println(findpath(maze,3));
    }

}
