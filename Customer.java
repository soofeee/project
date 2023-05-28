/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author aaloo
 */
public class Customer extends User{
    
    public Customer(){
     super();
    }
    
    public Customer(String name,int number){
        super(name,number);
    }
    
    public Customer copy(){
         Customer i=new Customer();
         i.setUserName(i.getUserName());
         i.setIdNumber(i.getIdNumber());
         return i;

    }
    
    
    
}
