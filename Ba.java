import java.util.*;
public class Ba
{


static void BFS(int t,int [][]adj)
{
int j,x=adj.length,y;
int []visited=new int[x];
Queue<Integer>q=new LinkedList<>();
visited[t]=1;
q.add(t);
while(!q.isEmpty())
{
y=q.peek();//add the adjacent vertex in to queues
System.out.print(q.poll());
for(j=0;j<adj.length;j++)
{

if(adj[j][y]!=0&&visited[j]!=1)
{
visited[j]=1;
q.add(j);
}
}
}
}

public static void main(String...args)
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int e=sc.nextInt();

int [][]adj=new int[n][n];
//int f,s;
for(int i=0;i<e;i++)
{
int f=sc.nextInt();
int s=sc.nextInt();
adj[f][s]=1;
adj[s][f]=1;
}
System.out.println("enter thestarting vertex");
int t=sc.nextInt();
BFS(t,adj);
}

}







 