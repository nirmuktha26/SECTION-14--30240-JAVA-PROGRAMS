import java.util.Scanner;
public class Array_search
{
public static void main(String args[])
{
int a[] = {10,20,30,40,50};
int b = 60;
int flag = 0;
for( int i = 0 ; i<a.length; i++)
{
if(a[i] == b){
System.out.println("the element is found at: "+i);
flag=1;
}
}
if(flag == 0){
System.out.println("invalid");
}
}
}
