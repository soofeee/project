/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.Scanner;

/**
 *
 * @author aaloo
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Management r=new Management (); 
       Scanner input = new Scanner(System.in); 
       int p;
       do{
             System.out.println("If you are an employee enter number 1\nIf you a customer enter number 2 \nIf you want to exis the system enter number 3 "); 
         p=input.nextInt(); 

         if(p==1) 
        { 
            r.employee(); 
        } 
         if (p==2){ 
            r.customer();   
        }
         if(p==3){
             System.exit(0);
         }
        } while(p<=3);
                     
       /* }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Please enter number 1 for employee and number 2 for customer and number 3 to exit system");
            System.exit(0);
        }   */
}
}
