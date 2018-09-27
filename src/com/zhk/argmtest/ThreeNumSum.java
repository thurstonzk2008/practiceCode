package com.zhk.argmtest;

public class ThreeNumSum {
    public int total = 0;

    int[] a = new int[10];
    int[] book = new int[10];
    public void sum(int step) {
        int i = 1;

        if (step == 10) {
            if (a[1] * 100 + a[2] * 10 + a[3] + a[4] * 100 + a[5] * 10 + a[6] == a[7] * 100 + a[8] * 10 + a[9]) {
                total++;
                System.out.println(a[1] + "==>" + a[2] + "==>"+ a[3] + "==>"+ a[4] + "==>" +a[5] + "==>" + a[6]  + "==>" + a[7] + "==>" + a[8] + "==>" + a[9]);
            }
            return;
        }
        for ( i = 1; i <= 9; i++) {
            if (book[i] == 0) {
               // System.out.println("step is "+ step);
                a[step] = i;
                book[i] = 1;
                sum(step + 1);
                book[i] = 0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        ThreeNumSum threeNumSum = new ThreeNumSum();
        threeNumSum.sum(1);
        System.out.println(threeNumSum.total);
    }
}
