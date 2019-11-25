public class square {
    static  void square(int num){
        // outer loop to handle number of rows
        for(int i = 0; i < num; i++){
            System.out.println();

            //  inner loop to handle number of columns
            for(int j = 0;j < num; j++){
                System.out.print("#");
            }

        }
    }
    public static void main(String[] args)
    {
        square(4);


    }
}
