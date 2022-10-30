package com.linecompare;

public class lineEqualUC2 extends LineLengthUC1 {
 int line1length,line2length;

    public void linelength1() {
        super.linelength();
        line1length=length;
        System.out.println("Line 1 length: "+line1length);
    }
    public void linelength2() {
        super.linelength();
        line2length=length;
        System.out.println("Line 2 length: "+line2length);
    }

    public void checkEqual()
{
    if(line1length==line2length)
    {
        System.out.println("Both lines are equal");
    }else
        System.out.println("Both lines are not equal");
}

    public static void main(String[] args) {
        lineEqualUC2 obj = new lineEqualUC2();
        System.out.println("Line 1");
        obj.Points();
        obj.linelength1();
        System.out.println();
        System.out.println("Line 2");
        obj.Points();
        obj.linelength2();

        obj.checkEqual();
    }
}
