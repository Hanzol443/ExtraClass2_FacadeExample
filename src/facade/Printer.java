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
public class Printer {


    private String docType;
    private String sheet;
    private String text;
    private boolean color;

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    
    
    
    public String getDocType() {
        return docType;
    }

    public String getSheet() {
        return sheet;
    }

    public String getText() {
        return text;
    }

    public boolean isColor() {
        return color;
    }
    
    public void printDoc() {
        System.out.println("Printing " + text + "\n color: " + color + "\n tipo: " + docType + "\n hoja: " + sheet);
}
}
