/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 *
 * @author tchakal.ahmed
 */
public class EncodageBase64 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //Encodage basic
        String str64 = Base64.getEncoder().encodeToString("TCHAKAL Ahmed".getBytes("UTF-8"));
        System.out.println(str64);

        //Décodage
        byte[] lesOctets = Base64.getDecoder().decode(str64);
        System.out.println(new String(lesOctets, "UTF-8"));
 
        //URL 
        String strURL64 = Base64.getEncoder().encodeToString("serveur/donnees?param".getBytes("UTF-8"));
        System.out.println(strURL64);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<10 ; i++){
            sb.append(UUID.randomUUID().toString());
        }
        byte[] donnees = sb.toString().getBytes("UTF-8");
        String strMIME64 = Base64.getMimeEncoder().encodeToString(donnees);
        System.out.println("MIME : "+strMIME64);
    }
}
