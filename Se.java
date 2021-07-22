import java.util.*;
class Se
{
public static void main(String...args)
{
int count=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
ArrayList<Integer>h=new ArrayList<>();
int i;
a[0]=sc.nextInt();
h.add(a[0]);
for(i=1;i<n;i++)
{
a[i]=sc.nextInt();
if(h.contains(a[i]))
{
h.add(a[i]);
count++;
}
else
{

}
}
System.out.println(n-count);
}
}
