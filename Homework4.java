package Homework;

import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n){
        if(n == 0) {return m;}
        else if(m < n) { return gcd(m,n%m);}
        return gcd(n,m%n);
    }

    int gcd2(int m ,int n) {
        int a = m;
        int b = n;
        while (true) {
            if (a > b) {
                a = a % b;
                if (a == 0) {
                    return b;
                }
            } else {
                b = b % a;
                if (b == 0) {
                    return a;
                }
            }
        }
    }

    public static void main(String[] args) {

        Homework4 hw4 = new Homework4();
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("두 수의 최대 공약수는 "+hw4.gcd(m,n)+"입니다.(재귀)");
        System.out.println("두 수의 최대 공약수는 "+hw4.gcd2(m,n)+"입니다.(반복)");
    }
}
