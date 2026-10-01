import java.util.Scanner;
public class Array_min
{
public static void main(String args[])
{
int a[] = {10,20,60,8,50};
int min = a[0];
for(int i = 0; i<a.length ; i++)
{
if(min > a[i]){
min = a[i];
}
}
System.out.println("The Minimum of Array is : " + min);
}
}