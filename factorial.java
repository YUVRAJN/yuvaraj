
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuvaraj
 */
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the number");
        int i;
        int fact = 1;
        for(i=a;i>0;i--)
        {
           fact = fact*i;
        }
            System.out.println("the factorial is:"+fact);
            
            
        }
}
            
        
        
        
    }
    
}
