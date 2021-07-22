import java.util.*;
class As
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer>ar=new ArrayList<>();
int n=sc.nextInt();
int temp=0;
int []a=new int[n];
int c=0,min=0;
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]>min)
{
min=a[i];

}
temp=min;
ar.add(a[i]);
}
//System.out.println(min);

for(i=0;i<ar.size();i++)
{
if(2*ar.get(i)>min)
{
//c++;
}

else if(2*ar.get(i)==Collections.max(ar))
{
//System.out.println("max eleement remelement reoved js"+Collections.max(ar));
ar.remove(Collections.max(ar));
//System.out.println("element equals to mareoved js"+ar.get(i));
//ar.remove(ar.get(i));
min=Collections.max(ar);

//System.out.println(min);
//System.out.println("size aftre max element removed isis"+ar.size());
c++;
//System.out.println("size of is"+ar.size());

}
else if(ar.get(i)==Collections.max(ar))
{
c++;
ar.remove(ar.get(i));
}
else
{
//System.out.println("element reoved js"+ar.get(i));
//System.out.println("size is"+ar.size());
c++;
}

}
System.out.println(c);

}
}


