import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String...args)
{
int n,k=0;
double a=0,b=0,c,d,e,f,g;
Scanner sc=new Scanner(System.in);
String s;

int t;
//n=sc.nextInt();
//t=s.length();
s=sc.next();
if(n%2!=0)
{
System.out.println("-1");
System.exit(0);
}
Stack<Character>st=new Stack<>();
int i,y=0;
int count=0;
for(i=0;i<n;i++)
{
if(s.charAt(i)=='('&&st.empty())
{
//System.out.println(s.charAt(i));
st.push(s.charAt(i));
}
else if(!st.empty()&&(s.charAt(i)==')'&&st.peek()=='('||(s.charAt(i)=='}'&&st.peek()=='{')||(s.charAt(i)==']'&&st.peek()=='[')))
{ 
y++;
char x=st.pop();
//System.out.println(x+""+s.charAt(i));
//
}
else if(!st.empty()&&(s.charAt(i)=='('&&st.peek()==')'))
{
count=count+2;
st.pop();
}
else
{
st.push(s.charAt(i));

}
}
if(count>0&&st.empty())
{
System.out.println(count);
}
else if(count==0&&st.empty())
{
System.out.println(count);
}
else if(!st.empty())
{
System.out.println("-1");

}
}
}
