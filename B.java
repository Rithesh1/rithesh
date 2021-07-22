import java.util.*;
class B
{
Queue<Integer>q=new LinkedList<>();
int edges[][]=new int[20][20];
int visit[]=new int[10];
int parent[]=new int[10];
int i,j;
 void BFS(int s)
{
for(j=0;j<4;j++)
{
visit[j]=0;
parent[j]=-1;
q.add(s);
 while(!q.isEmpty())
 {
j=q.peek();
//System.out.println(j);
for(int k=0;k<4;k++)
{
if(k==j)
{
continue;
}
   if(edges[j][k]==1&&visit[k]!=1)
   {
visit[k]=1;
parent[k]=j;
q.add(k);
   }
 }
}
}
}

public static void main(String...args)
{
B b=new B();


int f,s,i,j;
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int e=sc.nextInt();

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b.edges[i][j]=0;
}
}
for(i=0;i<e;i++)
{

f=sc.nextInt();
s=sc.nextInt();
b.edges[f][s]=1;
b.edges[s][f]=1;
}
b.BFS(0);

}
}