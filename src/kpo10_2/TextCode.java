/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10_2;

import java.util.Scanner;

/**
 * класс для получения кода 
 */
public class TextCode {
   Scanner in = new Scanner(System.in);
   /**
    * метод для получения кода 
    * @return - строка с кодом
    */
    public String getText() { 
        System.out.print("Введите код ");
        String s = in.nextLine();
        return s;
    }   
    
}
