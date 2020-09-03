import java.util.*;

public class Main {
	static int[][] graph;
	static boolean[] visit;
	static int N,M,start;
	public static void dfs(int start) {
		visit[start]=true;
		System.out.print(start+" ");
		for(int i=1;i<N+1;i++) {
			if(graph[start][i]==1&&visit[i]==false)
				dfs(i);
		}
	}
	public static void bfs(int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(start);
		visit[start]=true;
		System.out.print(start+" ");
		int tmp=0;
		while(!q.isEmpty()) {
			tmp=q.poll();
			for(int i=1;i<N+1;i++) {
				if(graph[tmp][i]==1&&visit[i]==false) {
					visit[i]=true;
					q.offer(i);
					System.out.print(i+" ");
				}
			}
		}
	}
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	N=sca.nextInt();
    	M=sca.nextInt();
    	start=sca.nextInt();
    	graph=new int[N+1][N+1];
    	visit=new boolean[N+1];
    	int x=0;
    	int y=0;
    	for(int i=1;i<=M;i++) {
    		x=sca.nextInt();
    		y=sca.nextInt();
    		graph[x][y]=graph[y][x]=1;
    	}
    	dfs(start);
    	for(int i=1;i<N+1;i++) {
    		visit[i]=false;
    	}
    	System.out.println();
    	bfs(start);
    }
}
