//////////////////////////////////////////////////////
// The Main class was created to test the work of   //
// the Printer class.                               //
//                                                  //
//////////////////////////////////////////////////////

package com.prykhodko;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(97, true);
        System.out.println("The number of the pages initially is " + printer.getPrintedPages());
        System.out.println("Pages printed are " + printer.printPages(26));
        System.out.println("New amount of print count fot the printer is " + printer.getPrintedPages());

        System.out.println("Pages printed are " + printer.printPages(2));
        System.out.println("New amount of print count fot the printer is " + printer.getPrintedPages());
    }
}
