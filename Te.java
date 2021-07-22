import java.util.*;
class Te
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
int []r=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Stack<Integer>s=new Stack<>();
for(int i=0;i<n;i++)
{
while(!s.empty()&&a[i]>a[s.peek()]){
int idx=s.pop();
System.out.println("idx is"+idx+"i is"+i);
r[idx]=i-idx;
System.out.print(s);
}
s.push(i);
System.out.println(i);
}
for(int i=0;i<n;i++)
{
System.out.print(r[i]+" ");
}
}

}
/*8
73
74
75
71
69
72
76
73*/