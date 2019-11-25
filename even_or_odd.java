import java.util.Scanner;

public class even_or_odd {
    static void even_or_odd(){


        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number");
        int num = input.nextInt();


        if (num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }


    }
    public static void main(String[] args)
    {

        even_or_odd();


    }
}
