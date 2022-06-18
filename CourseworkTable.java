/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author LEGION
 */
public class CourseworkTable {
    private String txt2,txt3,combo1,Value;
    private long txt1;
    private int txt4;
    
    public CourseworkTable(String Serial, String Title,String Author, String Category, String Value, String Price){
        this.txt1 = Long.parseLong(Serial);
        this.txt2 = Title;
        this.txt3 = Author;
        this.combo1 = Category;
        this.Value = Value;
        this.txt4 = Integer.parseInt(Price);
    }
    public long getserial(){
        return txt1;
    }
    public String getTitle(){
        return txt2;
    }
    public String getAuthor(){
        return txt3;
    }
    public String getCategory(){
        return combo1;
    }
    public String getValue(){
        return Value;
    }
    public int getPrice(){
        return txt4;
    }
    public String getSerial()
    {
        return String.valueOf(txt1);
    }
    public String getPrices(){
        return String.valueOf(txt4);
    }
}

