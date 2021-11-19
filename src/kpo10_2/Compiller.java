/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10_2;

/**
 * класс компилятор 
 */
public class Compiller {
    String code,text;
    /**
     * метод получения текса кода 
     */
    public void getText() {
        TextCode textcode = new TextCode();
        code = textcode.getText();
    }
    /**
     * метод для получения объектного кода
     */
    public void object(){
        ObjectCode objectCode = new ObjectCode();
        text = objectCode.compilation(code); 
    }  
    
    public void lexem() {
        //реализация метода
        System.out.println("Таблица лексем");
    }

    public void identificator() {
         //реализация метода
        System.out.println("Таблица идентефикаторов");
    }

    public void dsr() {
       //реализация метода
        System.out.println("ДСР");
    }

    public void triad() {
       //реализация метода
        System.out.println("Вывод триад");
    }

    public void optimization() {
        //реализация метода
        System.out.println("Результат оптимизации");
    }

    public void objectCode() {
        //реализация метода
        System.out.println("Объектный код");
    }
   
}