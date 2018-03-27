/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonanci {

    /**
     * @param n
     * @return 
     */
   public  static int fibo(int n)  {
    if(n == 0)
        return 0;
    else if(n<=1)
      return 1;
   else
      return fibo(n - 1) + fibo(n - 2);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka :");
             int n = in.nextInt();
             int nilai=0;
        for (int i = 1; i <= n; i++)
           nilai=nilai+fibo(i);
         
    
        System.out.println("");
    }
    
}
