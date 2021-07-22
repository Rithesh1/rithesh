import java.util.*;
class St
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
int s=0;
int x=sc.nextInt();
int sie=0;
while(s<x)
{

int n=sc.nextInt();
int k=sc.nextInt();
int t,i=0,h=0;

Stack<Integer>st=new Stack<>();
int j=0;
while(j<n)
{
t=sc.nextInt();
if(st.empty())
{
st.push(t);
}
else if(!st.empty()&&st.peek()<t)
{
k--;
st.pop();
st.push(t);
}

else

{
st.push(t);
}

j++;

}
//System.out.println(k);
//System.out.println(st.size());

ArrayList<Integer>al=new ArrayList<>();
int []a=new int[st.size()];
int []b=new int[st.size()];
s++;
//System.out.println(st);
if(k>0)
{
while(k>0)
{
while(!st.empty())
{

sie++;
a[i]=st.pop();
i++;

}
//System.out.println(sie);

for(i=sie-1;i>=0;i--)
{
b[h]=a[i];
h++;
al.add(b[h]);
}

//
System.out.println(al.remove(0));
System.out.println(al);
k--;

}
}
else

{
System.out.println(st);
}

}
}
}