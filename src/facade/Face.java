/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Hansel
 * @author Oscar
 */
public class Face {
    private Printer printer;
    
    public Face (String text){
        super();
        printer = new Printer();
        printer.setColor(true);
        printer.setSheet("A3");
        printer.setDocType("PDF");
        printer.setText(text);
    }
    public void print(){
        printer.printDoc();
    }
}

