/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.pkg2.pkg2;

/**
 *
 * @author eroihito
 */
import java.util.Scanner;

public class Lesson622 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("文字を入力してください。");
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        
        int k;
        
        k=str.indexOf("hello");
        if (k>=0) {
            System.out.println("こんにちは");
        } else {
            System.out.println("無視！");
        }
        
        
        
        
        
    }
    
}
