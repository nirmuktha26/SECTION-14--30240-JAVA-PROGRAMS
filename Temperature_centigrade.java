import java.util.Scanner;
public class Temperature_centigrade
{
public static void main(String args[])
{
Scanner scanner= new Scanner(System.in);
System.out.print("Enter the temperature: " );
double a=scanner.nextDouble();
if(a<0)
{
System.out.print("Freezing weather");
}
else if(a<=10)
{
System.out.print("very cold weather");
}
else if(a<=20)
{
System.out.print("cold weather");
}
else if(a<=30)
{
System.out.print("Normal weather");
}
else if(a<=40)
{
System.out.print("Hot weather");
}
else
{
System.out.print("Very Hot weather");
}
}
}



