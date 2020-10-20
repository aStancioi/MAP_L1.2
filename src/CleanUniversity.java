import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class CleanUniversity {
    char student;
    List<Integer> grades;
    public List<Integer> failed(List<Integer> arr){
        //returns a list of grades lower than 40
        List<Integer> under = new ArrayList<Integer>();
        for(int i:arr){
            if(i < 40){
                under.add(i);
            }
        }
        return under;
    }

    public int total(List<Integer> arr){
        //returns the final grade
        int sum=0,k=0;
        for(int i:arr){
            k++;
            sum = sum+i;
        }
        sum = sum/k;
        return sum;
    }

    public List<Integer> round(List<Integer> arr){
        //returns a list of rounded up grades
        int j;
        List<Integer> rounded = new ArrayList<Integer>();
        for(int i:arr){
            if(i>=38)
                for(j = 40; j<=100; j=j+5)
                    if(j>i){
                        rounded.add(j);
                    }
            else
                rounded.add(i);
        }
        return rounded;
    }

    public int maximum(List<Integer> arr){
        int max = 0;
        List<Integer> temp;
        temp = round(arr);
        for(int i:temp){
            if(max<i)
                max = i;
        }
        return max;
    }
}
