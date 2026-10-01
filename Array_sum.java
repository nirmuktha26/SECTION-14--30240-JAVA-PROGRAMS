import java.util.Scanner;
public class Array_sum
{
public static void main(String args[])
{
int a[] = {10,20,30,40,50};
int sum = 0;

for(int i=0;i<a.length;i++)
{
sum = sum +a[i];
}
double avg = sum/(a.length);
System.out.println("sum of array elements is: "+sum);
System.out.println("Average  of array elements is: "+avg);
}
}
 