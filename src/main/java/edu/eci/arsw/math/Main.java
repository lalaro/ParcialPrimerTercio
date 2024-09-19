/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.util.Arrays;

/**
 *
 * @author hcadavid
 */
public class Main {

    private static int[] bandas = new int[2];


    public static void main(String a[]) {
        System.out.println(bytesToHex(PiDigits.getDigits(0, 10, 6)));
        System.out.println(bytesToHex(PiDigits.getDigits(1, 100, 6)));
        System.out.println(bytesToHex(PiDigits.getDigits(1, 1000000, 7)));


        for(int i=bandas[0]; i<=bandas[1]; i++){
            System.out.println("Numero de iteraciones");
        }

        /*
        PiDigits.run();
        New Treahd = Thread intervalo1();
        intervalo1.start();
        intervalo1.start();*/

    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<hexChars.length;i=i+2){
            //sb.append(hexChars[i]);
            sb.append(hexChars[i+1]);            
        }
        return sb.toString();
    }

}
