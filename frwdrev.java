
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuvaraj
 */
public class frwdrev {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int[] a=new int[10];
        int i;
        for(i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
           }
        int j;
        for(j=9;j>=0;j--)
        {
           
            System.out.println(a[j]);
            
        }
}
}
