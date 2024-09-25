import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String ch = input.next();

        if ((ch.length() != 1) || !Character.isLetter(ch.charAt(0))) {  System.out.println("Invalid input");
            return;
       } else {  
            char letter = ch.charAt(0);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

System.out.println(letter + " is a vowel");
                 } else {
                    
System.out.println(letter + " is a consonant");
                }
            }
            input.close();
     }
 }
  
    

       
       
