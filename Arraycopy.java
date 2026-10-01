import java.util.*;
public class Arraycopy
{
public static void main(String args[])
{
int a[] = new int[10];
int b[] = new int[10];
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 10 Elements:");
for(int i =0;i<10;i++)
{
a[i] = scanner.nextInt();
}
for(int i = 0; i<10; i++)
{
b[i] = a[i];

System.out.println("the array values is "+ i +"="+b[i]);

}
}
}