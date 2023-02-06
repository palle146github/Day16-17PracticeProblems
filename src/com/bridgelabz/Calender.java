package com.bridgelabz;

import java.util.Scanner;

public class Calender {
    static int[][] calender = new int[6 ][7];
    static int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static void initCal() {
        for (int i = 0; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                calender[i][j] = -1;
            }
        }
    }


    static void display(int m, int y) {
        System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

        for (int i = 0; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                int days = 0;
                if (((y % 4 == 0)&&(y % 100!= 0)) || (y%400 == 0)  && ( m == 2) ) {
                    days = 29;
                }
                else{
                    days = month[m - 1];
                }
                if (calender[i][j] < 0 || calender[i][j] > days) {
                    System.out.print("\t ");
                } else if (calender[i][j] > 0) {
                    System.out.print("\t" + calender[i][j] + " ");
                }
            }
            System.out.println("\t");
        }
    }

    static void putCalender(int d) {
        int d1 = 1;
        for (int i = d; i < calender[0].length; i++) {
            // System.out.print(d1);
            calender[0][i] = d1++;
        }
        for (int i = 1; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                calender[i][j] = d1++;
            }
        }

    }

    static void dispCalender(int m, int y) {
        int d = dayOfWeek(m, y);
        initCal();
        putCalender(d);
        display(m,y);
    }

    static int dayOfWeek(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter month");
        int m = s.nextInt();
        System.out.println("enter yaer");
        int y = s.nextInt();
        dispCalender(m, y);
    }
}