/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author richardkaune
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This section has been commented out, just remove the double forward slashes to get the code to work
        //It is currently set up to work with the reading of 4 marks in for grade calculation
//        String [] numbers = new String [6];
//        numbers[0]="3";
//        numbers[1]="34";
//        numbers[2]="88";
//        numbers[3]="54";
//        numbers[4]="276";
//        numbers[5]="21";
        int[] number=new int[4];
        
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
        
        int total =0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 4 numbers ");
        for (int i=0;i<4;i++){
            number[i]=input.nextInt();
        }
        
        
        for (int i=0;i<number.length;i++){
            total= total + number[i];
        }
        System.out.println(total);
        System.out.println(total/4);
    }
    
}
