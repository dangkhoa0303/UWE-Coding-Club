import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int size = 0;

        //get the input size
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();

        //save the numbers!
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] > 0) {
                pos = pos + 1;
            }
            if (numbers[i] < 0) {
                neg = neg + 1;
            }
            if (numbers[i] == 0) {
                zero = zero + 1;
            }

        }

        pos = pos / size;
        neg = neg / size;
        zero = zero / size;

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);

    }
}
