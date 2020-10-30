/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan30.cakep;

/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
import java.util.Scanner;
public class PBOIF210119061Latihan30Cakep {
public static final String RED = "\u001b[31m";
public static final String GREEN = "\u001b[32m";
public static final String YELLOW = "\u001b[33m";
public static final String BLUE = "\u001b[34m";
public static final String PURPLE = "\u001b[35m";
public static final String CYAN = "\u001b[36m";

public static void kondisi(String hasil){
    if ("YOI".equals(hasil)){
        System.out.println("");
        System.out.println(RED+"Cakep Bener,"+PURPLE+"Good Job");
    }else{
        System.out.println("");
        System.out.println(RED+"Tetep Cakep Sih.");
        System.out.println(CYAN+"Sing penting paham onsep nya yeee.");
        System.out.println("keep the code works dude");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String hasil;
        
        System.out.println(RED+"Kamu,"+GREEN+"Ngerjadin sendiri");
        System.out.println(BLUE+"Jawab"+RED+"(YOI/GA)");
        hasil=input.next();
        System.out.println("");
        kondisi(hasil);
        System.out.println("===================================");
        System.out.println(RED+"Developed by : Rheizaa");
    }
    
}
