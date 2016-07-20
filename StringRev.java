/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.rev;

import java.util.Scanner;

/**
 *
 * @author yuvaraj
 */
public class StringRev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1;
        s1=sc.nextLine();
        String s2=new String();
        s2=new StringBuffer(s1).reverse().toString();
        System.out.println(s2);
        // TODO code application logic here
    }
}
