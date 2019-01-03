/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz11;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Technopc
 */
public class LabQuiz11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Random rnd=new Random();
        int ure=rnd.nextInt(1000);
        Scanner in=new Scanner(System.in);
        int tahmin;
        int adim=0;
        String ad="";
        System.out.println("Üretilen sayı="+ure);
        do
        {
        System.out.println("Tahmininizi girin:");
        tahmin=in.nextInt();
        adim++;
        if(tahmin<ure) System.out.println("Arttır!");
        else if(tahmin>ure)System.out.println("Azalt!");
        else {
            System.out.println(adim+". Tahmininde Buldun!");
            System.out.println("Kullanıcı adınızı giriniz");
            ad=in.next();
        }
        }while(tahmin!=ure);
      
      FileWriter out = null;
      try{
      out = new FileWriter("output.txt");   
      out.write(ad+" adlı kullanıcının tahmin sayısı="+Integer.toString(adim)); 
      }
      finally{out.close();}
    }
    
}
