/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Scanner;

/**
 *
 * @author aaloo
 */
public class Employee extends User {
     public static Scanner in=new Scanner(System.in);
     
     public Employee(){
         super();
     }
     public Employee(String name,int id){
        super(name,id);
    }
     
    public Book addBook(Book book){
    System.out.print("Enter book name:");
    String bookName=in.nextLine();
    book.setBook(bookName);
    System.out.print("Enter book price:");
    double bookPrice=in.nextDouble();
    in.nextLine();
    book.setPrice(bookPrice);
    return book;
    }
    
    public Employee copy(){
         Employee i=new Employee();
         i.setUserName(i.getUserName());
         i.setIdNumber(i.getIdNumber());
         return i;

    }
   
     }
