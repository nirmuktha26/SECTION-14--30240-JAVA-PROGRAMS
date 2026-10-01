import java.util.*;
public class Arm
{
	public static void main(String[] args)
	{
		System.out.println("the armstrong numbers before 1000 :");
		for(int i=10;i<=1000;i++)
		{
			
			int sum=i;
			int y=0;
			while(sum>0)
			{
				int x=sum%10;
        			y=y+(x*x*x);
        			sum=sum/10;
			}
			if(i==y)
			System.out.print(i+" ");
		}
	}
}