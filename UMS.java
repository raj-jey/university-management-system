/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to University Management System");
        System.out.println("Please select option to proceed");
        System.out.println("Press [1] Register as a student");
        System.out.println("press [2] Register as a lecture ");
        Scanner input=new Scanner(System.in);        
        
        
        while(input.hasNextInt()){
        int option=input.nextInt();
        if(option==1){
             System.out.println("Name:-");
             String s=input.next();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11111-Introduction to programming");
             System.out.println("[2]-SENG 11112-Fundamentals of Engineering");
             System.out.println("[3]-SENG 11113-Data Structures and Algorithem");
             int c=input.nextInt();
             Student std = new Student(s,age,c);
             std.printdata();
             
        }
        else if (option==2){
            System.out.println("Name:-");
             String s=input.next();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11111-Introduction to programming");
             System.out.println("[2]-SENG 11112-Fundamentals of Engineering");
             System.out.println("[3]-SENG 11113-Data Structures and Algorithem");
             int c=input.nextInt();
             lecture lec=new lecture(s,age,c);
             lec.printdata();
            
        }
                }
        
    }
    
}
