import java.util.*;
class Sp
{
public static void main(String...args) throws Exception
{
Scanner sc=new Scanner(System.in);
String s;
s=sc.next();
int len=s.length();
//System.out.println(len);
ArrayList<Character>t=new ArrayList<>();
int i;

for(i=0;i<len;i++)
{
if(t.isEmpty())
{
t.add(s.charAt(i));
System.out.println("a is empty"+t);
}
else if(t.contains(s.charAt(i)))
{

int x=t.remove(s.charAt(i));
System.out.println(s.charAt(i)+" is removed"+x);
}
else
{
t.add(s.charAt(i));
System.out.println(t);
}
}
try
{
System.out.println(t);
}
catch(IndexOutOfBoundsException E)
{
System.out.println("empty");
}
}
}