public class isosceles {
    static  void    isosceles(int num){
        // outer loop to handle number of rows
        for (int i=0; i<num; i++)
        {
            System.out.println();
            // inner loop to handle number spaces
            for (int j=num-i; j>1; j--)
            {
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            for (int j=0; j<=i; j++ )
            {

                System.out.print("#");
            }
        }
    }

    public static void main(String[] args)
    {
        isosceles(4);


    }
}
