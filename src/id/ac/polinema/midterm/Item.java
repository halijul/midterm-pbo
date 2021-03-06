package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    protected String name;
    protected float price;
    protected int amount;
    
    //Konstruktor class Item
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    //Method untuk mengembalikan total harga per item
    public float getTotal() {
        return this.price * this.amount;
    }
    
    //Method untuk menampilkan isi dari method Item
    public String toString() {
        String tostring = "";
        tostring += "| "+this.name+" \t\t| "+this.price+" \t| "+this.amount+" \t\t| "+ this.getTotal() +"\t|";
        return tostring;
    }
    
}
