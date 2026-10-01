import java.util.Scanner;
public class Array_search2
{
public static void main(String args[])
{
int a[] = {10,20,30,40,50,40};
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number: " );
int search = scanner.nextInt();
int flag = 0;
int count = 0;
for( int i = 0 ; i<a.length; i++)
{
if(a[i] == search){
System.out.println("the element is found at: "+i);
flag=1;
count++;
}
}
if(flag == 0){
System.out.println("invalid");
}
}
}
