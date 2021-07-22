import java.util.*;
class S
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
int i;
Queue<Character>q=new LinkedList<>();
String s,t;
s=sc.next();
int len=s.length();
int x=len;
for(i=0;i<len;i++)
{
System.out.println(s.charAt(i));
}
int j=0;
for(i=0;i<len;i++)
{
if(i%2==0)
{
System.out.println("as");
q.add(s.charAt(j));
System.out.print("value at j is"+q);
j++;
}
else
{
q.add(s.charAt(x));
System.out.print(q);
x--;
}
}

}
 
}