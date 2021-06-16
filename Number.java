public class Number {
    public static int maxNumber(int[] arr){
        int res = Integer.MIN_VALUE;

        for (int num: arr){
            if (num > res)
                res = num;

        }
        return res;
    }

    public static int minNumber(int[] arr){
        int res = Integer.MAX_VALUE;

        for (int num: arr){
            if (num < res)
                res = num;

        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(maxNumber(arr));
        System.out.println(minNumber(arr));
    }

}
