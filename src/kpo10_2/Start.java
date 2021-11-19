/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Start {
     //создаем объект 
    Compiller compiler = new Compiller();
    Scanner scanner = new Scanner(System.in);
    
    /**
     * метод для запуска нашего компилятора
    */
    public void result() {
         compiler.getText();
         System.out.println("Выберите действие: \n" +
                "1 - Вывести таблицу лексем\n" +
                "2 - Вывести таблицу идентификаторов\n" +
                "3 - Вывести ДСР\n" +
                "4 - Вывести триады\n" +
                "5 - Вывести результат оптимизации\n" +
                "6 - Вывести объектный код");
        int num = scanner.nextInt();
        switch (num) {
        case 1: compiler.lexem();
            break;
        case 2: compiler.identificator();
            break;
        case 4: compiler.dsr();
            break;
        case 3: compiler.triad();
            break;
        case 5: compiler.optimization();
            break;
        case 6: compiler.object(); //метод для перевода в объектный код
                compiler.objectCode();  //метод для вывода результата
            break;
        default:
            break;
    }
        
    }
}
