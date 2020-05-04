import java.util.*;

public class poly{
    public static void main(String []args) {
        String plaintext = "meet me after the toga party";
        String key = "sololearn";
        String final_key = "", ciphertext = "";
        
        ArrayList<ArrayList<Character>> vignere = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            ArrayList<Character> row_vignere = new ArrayList<>();
            for (int j = 0; j < 26; j++)
                row_vignere.add(alphabet.charAt((i + j) % 26));
            vignere.add(row_vignere);
        }
        
        for (int i = 0, j = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) >= 'a' && plaintext.charAt(i) <= 'z')
                final_key += key.charAt((j++) % key.length());
            else
                final_key += plaintext.charAt(i);
        }
        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) >= 'a' && plaintext.charAt(i) <= 'z')
                ciphertext += vignere.get(alphabet.indexOf("" + final_key.charAt(i))).get(alphabet.indexOf("" + plaintext.charAt(i)));
            else
                ciphertext += plaintext.charAt(i);
        }
        
        System.out.println("Polyalphabetic Cipher [Encryption]");
        System.out.println("Plain Text  : " + plaintext);
        System.out.println("Key         : " + key);
        System.out.println("Cipher Text : " + ciphertext);
    }
}