/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.pkg2;

/**
 *
 * @author eroihito
 */
public class Lesson62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] ss = {
            "阿部 80 70",
            "井上 90 60",
            "神山 70 80"
        };
        int n;
        //String sss[];
        double sugaku[]=new double[200];
        double eigo[]=new double[200];
        String namae[]=new String[200];
        for(n=0;n<3;n++){
            String sss[]=ss[n].split(" ");
            namae[n]=sss[0];
            sugaku[n]=Double.parseDouble(sss[1]);
            eigo[n]=Double.parseDouble(sss[2]);
        }
        for(n=0;n<3;n++){
            System.out.println(namae[n]+"さんの数学の点数は"+sugaku[n]+"点、英語の点数は"+eigo[n]+"点です。");
        }
    }
    
}
