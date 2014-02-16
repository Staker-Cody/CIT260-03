/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

import java.util.Scanner;



/**
 *
 * @author Cody
 */
public class Forloop {

    /**
     * @param args the command line arguments
     */
String number;
int y;


    public static void main(String[] args) {
        
 Forloop forloop = new Forloop();       
        forloop.loop();
        // TODO code application logic here
    }
    
    public void loop(){
    
       System.out.println("enter the number of times you want this loop to run.");
        Scanner input = new Scanner(System.in);
        this.number = input.next();
          this.y = Integer.parseInt(number);
          while(y < 0){
               System.out.println("enter a number above zero"); 
               this.number = input.next();
               this.y = Integer.parseInt(number);
           
          }
         for(int counter = 1; counter <= y; counter++){
System.out.println("The number is: " + counter);

    }}}

