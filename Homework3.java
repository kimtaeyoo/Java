package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇개의 수를 입력 할 예정인가요? ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("수를 입력하세요: ");

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < num; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
