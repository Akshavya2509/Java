import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Raptus {
    public static void main(String[] args) {
        String encodedString = "B3BCLCMF0AWUUGDVBGRLBIBZCGLKZXIK";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

        System.out.println("Decoded Message: " + decodedString);
    }
}
// HINT!!
// Raptus Question Bank 100%
//  10 E8 
//  Symmetry and 16 holds the key for vault 
// Symmetryand16holdsthekeyforvault 

// Turn on screen reader support
// To enable screen reader support, press ⌘+Option+Z 

// To learn about keyboard shortcuts, press ⌘slash

// rgb(1,1,1)