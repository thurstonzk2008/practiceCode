package com.zhk.leetcode;

public class QuickSort {
    public void setA(int[] a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }

    private int[] a = new int[10];
    private  int n;
    public void quickSort(int left,int right){
        int i,j,t,temp;
        if(left>right){
            return;
    }
        temp=a[left];
        i=left;
        j=right;
        while (i!=j){

            while (a[j]>=temp&&i<j){

                j--;
            }
            while (a[i]<=temp&&i<j){
                i++;
            }
            if(i<j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
            a[left]=a[i];
            a[j]=temp;
            quickSort(left,i-1);
            quickSort(i+1,right);

    }

    public static void main(String[] args) {
        QuickSort qs= new QuickSort();
        int[] a={3,6,1,2,9,100,3,4,5,3};
        qs.setA(a);
        qs.setN(9);
        qs.quickSort(0,9);
        for (int k=0;k<a.length;k++)
            System.out.println(a[k]);
    }
}
