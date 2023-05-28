/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author aaloo
 */
public class Book {
    
    private String book;
    private double price;
  
    
     public Book(){
         
     }
     
    public Book(String book,double price){
        this.book=book;
        this.price=price;
    }

    public String getBook() {
        return book;
    }


    public double getPrice() {
        return price;
    }


    public void setBook(String book) {
        this.book = book;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    
    
    public String toString(){
        return"Book name: "+book+", Price: "+price+" SAR";
    }
}
