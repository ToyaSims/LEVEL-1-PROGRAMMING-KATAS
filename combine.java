public class combine {
    static int[] combine(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[count++] = arr2[j];
        }
        for (int i = 0; i < arr3.length; i++) System.out.print(arr3[i] + " ");
        return arr3;
    }

    public static void main(String[] args)
    {

        int[] combine = combine(new int[]{11,22,33},new int[]{1,2,3});

    }
}
