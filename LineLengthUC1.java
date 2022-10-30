package com.linecompare;

import java.util.Scanner;

public class LineLengthUC1 {

    int x1, y1 ,x2 ,y2 ,length;
    public  void Points() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x1");
         x1 = s.nextInt();
        System.out.println("Enter value of y1");
         y1 = s.nextInt();
        System.out.println("Enter value of x2");
         x2 = s.nextInt();
        System.out.println("Enter value of y2");
         y2 = s.nextInt();

        System.out.println("Points : "+x1+" "+y1+" "+x2+" "+y2);
    }

    public void linelength()
    {
        int l1=x2-x1;
        int l2=y2-y1;
        length= (int)Math.sqrt(Math.pow(l1,2)+Math.pow(l2,2));
        System.out.println("Length of line is : "+length);
    }

    public static void main(String[] args) {
        LineLengthUC1 obj = new LineLengthUC1();
       obj.Points();
        obj.linelength();
    }
}


