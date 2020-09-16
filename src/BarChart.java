import TurtleGraphics.*;
import java.util.Scanner;
import java.awt.Color;
public class BarChart {

    public static void main(String[] args) {
        Pen P = new StandardPen();
        Scanner s = new Scanner(System.in);
        
    }
    public static void makeBar(Pen p,int xloc, int yloc, int length, Color col) {
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length+"");
    }
    
}
