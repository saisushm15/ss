/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprogram;

/**
 *
 * @author konda babu
 */
import java.util.Scanner;
public class Stringprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.length());   
    }
    
}
