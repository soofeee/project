/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.*;

/**
 *
 * @author aaloo
 */
public class Management {
 private Employee employee;
 private Customer customer;
 private ArrayList <Book> bookList=new ArrayList <Book>();
 public static Scanner in=new Scanner(System.in);

 
public void employee(){
    System.out.println("Employee: \nEnter your name:");
    String name=in.nextLine();
    System.out.println("Enter your ID number:");
    int id=in.nextInt();
    employee=new Employee(name,id);
    employee.copy();
    System.out.println(employee.toString());
    System.out.println(name+" Your job is to add 3 books by name and price");
    Book book1=new Book();
    employee.addBook(book1);
    Book book2=new Book();
    employee.addBook(book2);
    Book book3=new Book();
    employee.addBook(book3);
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    bookList(bookList);
    System.out.println("Good job "+employee.getUserName());

}

public void customer(){
    in.nextLine();
    System.out.println("Customer: \nEnter your name:");
    String name=in.nextLine();
    System.out.println("Enter your ID number:");
    int id=in.nextInt();
    in.nextLine();
    customer=new Customer(name,id);
    customer.copy();  
    System.out.println(customer.toString());
    bookList(bookList);
    
    String answer;
    int book;
    ArrayList<String>bookBag=new ArrayList<String>();
    double sum=0.0;
    
    do{
    System.out.println(name+" Do you want to buy a book(yes/no):");
    answer=in.nextLine();
    if(answer.equalsIgnoreCase("no")){
       break;}
     System.out.println("Enter the number of book you want to buy from the book list (choose a number from 1 to  3):");
     try
     {
     book=in.nextInt();
     bookBag.add(bookList.get(book-1).getBook());
     sum=sum+bookList.get(book-1).getPrice();
     } catch(Exception e){
         System.out.println(e.getMessage()); 
         System.out.println("Try agin \nenter a number from 1 to 3!");
                }
     in.nextLine();
    }while(answer.equalsIgnoreCase("yes"));
    
    bill(bookBag,sum);
    }
     
     private void bookList(ArrayList<Book>w){
        for(int i=0;i<w.size();i++)
        System.out.println(i+1+"- "+w.get(i).toString());
    }
     
     
     
    private void bill( ArrayList<String>bookBag,double sum){
        System.out.println("Your bag includes:");
          for(int x=0;x<bookBag.size();x++){
              System.out.println(x+1+"- "+bookBag.get(x));
          }
          System.out.println("The total price will be: "+sum+" SAR");
    }

}
