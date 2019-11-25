public class triangle {
    static  void  triangle(int num){
        //rows
        for(int i=0; i<num; i++)
        {
            System.out.println();

            //columns
            for(int j=0; j<=i; j++)
            {
                System.out.print("#");
            }
        }
    }

    public static void main(String[] args)
    {

        triangle(4);


    }
}
