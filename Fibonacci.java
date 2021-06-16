import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> printFibonacci(int number) {
        ArrayList<Integer> res = new ArrayList<>();

        if (number == 0) {
            res.add(0);
            return res;
        }

        if (number == 1) {
            res.add(0);
            res.add(1);
            return res;
        }

        res.add(0);
        res.add(1);

        for (int i = 2; i <= number; i++) {
            res.add(res.get(i - 2) + res.get(i - 1));
        }

        return res;

    }

    public static void main(String[] args) {
        int number =5 ;

      ArrayList<Integer> arr = printFibonacci(number);

        for (int i: arr)
           System.out.println(i);

      for(int i = number ; i >= 0; i--)
            System.out.println(arr.get(i));
    }
}
