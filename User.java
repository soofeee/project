/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author aaloo
 */
public class User {
    private String userName;
    private int idNumber;  
    
    public User(){
        
    }
    public User(String name,int number){
        userName=name;
        idNumber=number;
    }

    public String getUserName() {
        return userName;
    }

    public int getIdNumber() {
        return idNumber;
    }

   
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setIdNumber(int phoneNumber) {
        this.idNumber = phoneNumber;
    }

    
    public String toString(){
        return "name: "+userName+"  ,  ID number "+idNumber;
    }
  
    
}
