/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bryandatabase;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class Bryan_BASICMATH {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mendoza Bryan");
        System.out.println("Enter a number:");
        int x = input.nextInt();
        
        System.out.println("Enter a number:");
        int y = input.nextInt();
        int sum,diff,prod,quo;
        sum = x+y;
        diff = x-y;
        prod = x * y;
        quo = x / y;
        System.out.println("total:"+sum);
        System.out.println("diff is:"+diff);
        System.out.println("product is:"+prod);
        System.out.println("quo:"+quo);
     }
}
