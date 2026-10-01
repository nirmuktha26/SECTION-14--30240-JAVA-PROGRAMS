import java.util.Scanner;

public class TrafficLight
 {
 public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traffic light colour (R/Y/G): ");
        char light = scanner.next().charAt(0);

        if (light == 'R') 
{
    System.out.println("The light is RED. STOP.");
        } 
        else if (light == 'Y')
 {
   System.out.println("The light is YELLOW. PREPARE TO STOP.");
        } 
        else if (light == 'G')
 {
    System.out.println("The light is GREEN. PROCEED.");
        } 
        else
 {
            System.out.println("Invalid input.");
        }

        
    }
}
