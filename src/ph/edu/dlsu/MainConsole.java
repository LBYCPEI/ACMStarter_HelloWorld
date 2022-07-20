package ph.edu.dlsu;

import acm.program.ConsoleProgram;


public class MainConsole extends ConsoleProgram {

    public void run() {
        println("Hello World!"); // ACM println
    }

    public static void main (String [] args){
        (new MainConsole()).start(args);
    }
}
