import java.util.Scanner;
public class Array_max
{
public static void main(String args[])
{
int a[] = {10,20,60,40,50};
int max = a[0];
for(int i = 0; i<a.length ; i++)
{
if(max < a[i]){
max = a[i];
}
}
System.out.println("The maximum of Array is : " + max);
}
}