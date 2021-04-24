package power_of_2;

/*
    Given number N. Print all integer powers of two, not exceeding N, in ascending order.
    package power_of_2;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = 1;
        System.out.println(power);
        while (true){
            power *= 2;
            if(power > number) {
                break;
            }
            System.out.println(power);
        }


    }
}
