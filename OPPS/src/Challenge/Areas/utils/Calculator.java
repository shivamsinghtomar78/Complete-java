package Challenge.Areas.utils;

import Challenge.Areas.geometry.Rectangle;
import Challenge.Areas.geometry.circle;

public class Calculator {
    public static void main(String[] args) {
       circle cir=new circle(5.5);
       Rectangle rect=new Rectangle(10,5);

       double cirArea=Math.PI*Math.pow(cir.radius, 2);
       int rectArea= rect.breath*rect.length;
        System.out.printf("Area of the circle is: %s,Area of the Rectangle is: %s",cirArea,rectArea);
    }
}
