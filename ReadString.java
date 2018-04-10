/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;
/**
 *
 * @author jermainerogers
 */
public class ReadString {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("String read from console is: \n" + inputString);
    }
}
