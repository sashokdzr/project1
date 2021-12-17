package Codewars;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(Exercise3("tet"));
    }
        public static String Exercise3(String word) {
            //Code goes here!
            String res;
            char[] array = word.toCharArray();
            if (array.length%2==0 && array.length>1){
                res ="" + array[(array.length)/2-1] + array[(array.length)/2];
            }
            else
            if (array.length==1)
                res= ""+ array[array.length-1];
            else
                res = "" + array[((array.length))/2];
            return res;
        }
}
