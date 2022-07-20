package ph.edu.dlsu; // file organization

import acm.graphics.GLabel;
import acm.program.*;


public class MainGraphics extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI OOP!");
        add(text, 100, 100);
    }
    // Solves java.lang.NoClassDefFoundError or java.lang.UnsatisfiedLinkError
    public static void main (String [] args){
        (new MainGraphics()).start(args);
    }
}

