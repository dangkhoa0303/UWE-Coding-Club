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

        //output
        int output = 0;
        for (int i = 0; i < size; i++) {
            output = output + numbers[i];

        }

        //output
        System.out.println(output);

    }
}
