/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.util.Scanner;

/**
 *
 * @author Mike Monical
 */
public class Crypto {
static Scanner get = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       System.out.println("Please select a menu Option: \n");
       System.out.println("Press 1 for Atbash");
       System.out.println("Press 2 for Frequency Analysis");
       System.out.println("Press 3 for Vigenere");
       System.out.println("Press 4 for Index of Coincidence");
       int i = get.nextInt();
       get.nextLine();
        switch (i) {
            case 1:
                Atbash();
                break;
            case 2:
                FreqCount();
                break;
            case 3:
                Vigenere();
                break;
            case 4:
                Vigenere();
                break;
            default:
                break; 
        }
    }

    private static void Atbash() {
        System.out.println("Please enter your text:");
        String text;
        text = get.nextLine();
        Atbash atbash = new Atbash(text);
        System.out.println(atbash.encrypt());
    }

    private static void FreqCount() {
        FreqCount freq = new FreqCount();
        freq.analyze();
    }

    private static void Vigenere() {
        
        System.out.println("Enter key");
        String key = get.nextLine().toUpperCase();
        Vigenere vig = new Vigenere(key);
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        int choice = get.nextInt();

        if(choice == 1){
            String encryptedMsg = vig.encrypt();
            System.out.println("Encrypted message: " + encryptedMsg);
            System.exit(0);
        }
        else if(choice == 2){
            String decryptedMsg = vig.decrypt();
            System.out.println("Decrypted message: " + decryptedMsg + "\n");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input");
        }          
    }
    
}
