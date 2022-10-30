package com.linecompare;

public class LineCompareUC3 extends lineEqualUC2{

    public void compareLine()
    {
        if(line1length==line2length)
        {
            System.out.println("Both line are equals");
        } else if (line1length>line2length) {
            System.out.println("Line 1 is Greater ");
        }else
        {
            System.out.println("Line 2 is Greater");
        }
    }

    public static void main(String[] args) {
        LineCompareUC3 obj = new LineCompareUC3();

        System.out.println("Line 1");
        obj.Points();
        obj.linelength1();

        System.out.println();

        System.out.println("Line 2");
        obj.Points();
        obj.linelength2();

        obj.compareLine();

    }


}
