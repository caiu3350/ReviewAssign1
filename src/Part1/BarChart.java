package Part1;
import TurtleGraphics.*;
import BreezySwing.*;
import java.util.Scanner;
import java.awt.Color;
public class BarChart {
    static SketchPadWindow spw = new SketchPadWindow(600,500);
    static Pen p = new StandardPen(spw);
    public static void main(String[] args) {
        int x1, x2, x3, x4;
        Scanner s = new Scanner(System.in);
        makeBase(-175,-213,350);
        System.out.print("Enter 1 out of 4 values > ");
        x1 = s.nextInt();
        makeBar(-150,-200,x1,Color.BLUE);
        System.out.print("Enter bar value > ");
        x2 = s.nextInt();
        makeBar(-50,-200,x2,Color.RED);
        System.out.print("Enter bar value > ");
        x3 = s.nextInt();
        makeBar(50,-200,x3,Color.GREEN);
        System.out.print("Enter bar value > ");
        x4 = s.nextInt();
        makeBar(150,-200,x4,Color.ORANGE);
        
    }
    public static void makeBar(int xloc, int yloc, int length, Color col) {
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setWidth(15);
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length+"");
    }
    public static void makeBase(int xloc, int yloc, int length) {
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setWidth(10);
        p.setColor(Color.BLACK);
        p.setDirection(0);
        p.move(length);
    }
    
}
