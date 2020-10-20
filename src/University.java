import java.io.*;
import java.lang.*;
import java.util.*;

public class University {
    char student;
    int[] grades;

    static int[] failed(int[] array){
        int[] newarr = null;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]<40 && newarr!=null) {
                int[] aux = new int[newarr.length + 1];
                for (int j = 0; j < newarr.length; j++){
                    aux[j] = newarr[j];
                }
                aux[newarr.length+1] = array[i];
                newarr = aux;
            }
            else{
                newarr = new int[1];
                newarr[0] = array[i];
            }
        }
        return newarr;
    }

    static int durchschnitt(int[] array){
        int sum=0, k=0;
        for (int i = 0;i<array.length;i++){
            sum = sum+array[i];
            k++;
        }
        int med = sum/k;
        return med;
    }

    static int[] round(int[] arr){
        for (int i=0; i<arr.length;i++){
            if(arr[i]>=38){
                for(int j=40; j<=100; j=j+5){
                    if(j-arr[i]<3){
                        arr[i] = j;
                        break;
                    }
                }
            }
        }
        return arr;
    }

    static int maxround(int[] arr){
        arr = round(arr);
        int max = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i]>max)
                max = arr[i];

        return max;
    }


}

