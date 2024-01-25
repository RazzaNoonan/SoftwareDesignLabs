//package ie.atu.classic.vigenere;
//
//import ie.atu.sw.crypto.symmetric.VigenereCypher.VigenereKey;
//
//
//import java.util.Scanner;
//
//public class Vigenere {
//
//    public static void main(String[] args) {
//        // Scanner object for taking input from console
//        Scanner scanner = new Scanner(System.in);
//        
//        // Create instance of VigenereCypher
//        VigenereCypher vigenereCypher = new VigenereCypher();
//
//        // Take the key input
//        System.out.println("Enter the key for Vigenere Cipher:");
//        String key = scanner.nextLine();
//        vigenereCypher.setKey(key); // Setting the key
//        
//        // Take the plaintext input
//        System.out.println("Enter the plaintext to encrypt:");
//        String plainText = scanner.nextLine();
//        
//        // Encrypt the plaintext
//        try {
//            byte[] encryptedText = vigenereCypher.encrypt(plainText.getBytes());
//            String encryptedString = new String(encryptedText); // Converting byte array to String
//            System.out.println("Encrypted Text: " + encryptedString);
//        } catch (Throwable e) {
//            System.out.println("An error occurred during encryption: " + e.getMessage());
//        }
//        
//        // Take the ciphertext input
//        System.out.println("Enter the ciphertext to decrypt:");
//        String cipherText = scanner.nextLine();
//        
//        // Decrypt the ciphertext
//        try {
//            byte[] decryptedText = vigenereCypher.decrypt(cipherText.getBytes());
//            String decryptedString = new String(decryptedText); // Converting byte array to String
//            System.out.println("Decrypted Text: " + decryptedString);
//        } catch (Throwable e) {
//            System.out.println("An error occurred during decryption: " + e.getMessage());
//        }
//        
//        // Closing the scanner object
//        scanner.close();
//    }
//}
//
