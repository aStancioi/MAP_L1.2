import java.util.*;

public class Shop {
    List<Integer> tastatur;
    List<Integer> usb;

    public int cheap(List<Integer> t) {
        int max = 0, min;

        for (int i : t)
            if (max < i)
                max = i;
        min = max;

        for (int j : t)
            if (min > j)
                min = j;

        return min;
    }

    public int highest(List<Integer> u, List<Integer> t) {
        int max = 0;

        for (int i : u)
            if (max < i)
                max = i;

        for (int j : t)
            if (max < j)
                max = j;

        return max;
    }

    public int budget(List<Integer> u, int cash) {
        if (cash == 0)
            return 0;

        int max = 0;

        for (int i : u)
            if (max < i && i < cash)
                max = i;

        return max;
    }

    public int buy(List<Integer> u, List<Integer> t, int cash) {
        int total = 0;
        for (int i = 0; i < u.size(); i++) {
            for (int j = 0; j < t.size(); j++) {
                if (i + j < cash && total < i + j)
                    total = i + j;
            }
        }
        return total;
    }
}
