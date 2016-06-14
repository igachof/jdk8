/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.pkg1;

/**
 *
 * @author eroihito
 */
public class Lesson61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="あいう";
        String str2="えお";
        String str5="あいうえお";
        
        String str3=new String(str1);
        String str4= str1+str2;
        
        String str6=str5.substring(1,3);
        String str7=str5.substring(3,str5.length());
        
        String str8=str5.replaceAll("う","あ");
        
        System.out.println(str6);
        System.out.println(str8);

        System.out.println("str1="+str1+", str3="+str3);
        if(str1.equals(str3))
          System.out.println("文字列は同じです．");
        else
          System.out.println("文字列は違います．");
        




        
        
    }
    
}
