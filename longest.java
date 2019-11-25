public class longest {
    static String longest(String[] list){
        int largestLength = -1;
        String largestWord ="";
        for(String x: list)
            if(x.length()>=largestLength){
                largestWord = x;
                largestLength = x.length();
            }
        return largestWord;
    }

    public static void main(String[] args)
    {
        String longest= longest(new String[]{"once", "upon", "a","time"});
        System.out.format(longest);


    }
}
