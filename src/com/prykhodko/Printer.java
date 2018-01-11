//////////////////////////////////////////////////////
// The Printer class was created to demonstrate how //
// encapsulation works in Java.                     //
//                                                  //
//////////////////////////////////////////////////////

package com.prykhodko;

public class Printer {
    private int amountOfToner;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int amountOfToner, boolean isDuplex) {
        if(amountOfToner >=0 && amountOfToner <=100) {
            this.amountOfToner = amountOfToner;
        }else{
            this.amountOfToner = -1;
        }
        this.printedPages = 0;
        this.isDuplex = isDuplex;
    }

    /**
     * Add more toner to the printer
     * @param tonerAmount - new amount of toner to add
     * @return new amount of toner or error
     */
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            if(this.amountOfToner + tonerAmount > 100){
                return -1;
            }
            this.amountOfToner +=tonerAmount;
            return this.amountOfToner;
        }else{
            return -1;
        }
    }

    /**
     * Simulates the printing of the pages in the printer
     * @param pages
     * @return the amount of printed pages
     */
    public int printPages(int pages){
        if(this.isDuplex){
            pages /= 2;
            System.out.println("The duplex mode is on. The number of pages printed is " + pages);
        }
        this.printedPages += pages;
        return pages;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
