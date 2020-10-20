import java.util.*;
import java.lang.*;

public class Ub3 {
    public List<Integer> add(List<Integer> a, List<Integer> b) {
        //adds the elements of two arrays by converting both arrays into numbers, then adding them
        //the resulting number is then inverted and put into an array
        List<Integer> sum = new ArrayList<Integer>();
        int suma = 0, sumb = 0;
        for (int i = 0; i < a.size(); i++) {
            suma = suma * 10 + a.get(i);
            sumb = sumb * 10 + b.get(i);
        }

        int temp = suma + sumb;
        int inv = 0;

        while (temp > 0) {
            inv = inv * 10 + temp % 10;
            temp /= 10;
        }

        while (inv > 0) {
            sum.add(inv % 10);
            inv /= 10;
        }
        return sum;
    }

    public List<Integer> dif(List<Integer> a, List<Integer> b) {
        //calculates the difference of the numbers in an array, same principle as in the add method
        List<Integer> dif = new ArrayList<Integer>();
        int difa = 0, difb = 0;
        for (int i = 0; i < a.size(); i++) {
            difa = difa * 10 + a.get(i);
            difb = difb * 10 + b.get(i);
        }

        int inv = 0;
        int temp = difa - difb;
        while (temp > 0) {
            inv = inv * 10 + temp % 10;
            temp /= 10;
        }

        while (inv > 0) {
            dif.add(inv % 10);
            inv /= 10;
        }
        return dif;
    }

    public List<Integer> mul(List<Integer> arr, int num) {
        //uses the add method to multiply a number
        List<Integer> m = arr;
        while (num != 0) {
            m = add(m, arr);
            num--;
        }
        return m;
    }

    public List<Integer> div(List<Integer> arr, int num) {
        //converts the given array to a number, which is then divided by the given one
        //gets put back in an array through the same principle of the add & dif methods
        List<Integer> d = new ArrayList<Integer>();
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            temp = temp * 10 + arr.get(i);
        }
        temp = temp / num;

        int inv = 0;
        ;
        while (temp > 0) {
            inv = inv * 10 + temp % 10;
            temp /= 10;
        }

        while (inv > 0) {
            d.add(inv % 10);
            inv /= 10;
        }
        return d;
    }
}
