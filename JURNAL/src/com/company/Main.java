package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n1 = 1, n2 = 1, n3, i, count;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        count = sc.nextInt();

        System.out.print(n1 + " " + n2);

            for (i = 2; i < count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }

        }
    }
