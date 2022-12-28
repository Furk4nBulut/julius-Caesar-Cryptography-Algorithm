import java.util.Scanner;
public  class Cryptography {
    static String message="";
    static  int letterNumber =0;
    static String lastMessage ="";
    static String decryptedMessage="";
    public static void takeMessage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your message to convert: ");
         message = scan.nextLine();  // Take input from user
        //There is a statement to set uppercase and is it letter.
        message = message.toUpperCase();
        control(message);
    }
    private static void control (String message) {

        Scanner scan = new Scanner(System.in);
        boolean control = true;
        //There is a loop to control is these letters between A and Z but without ' ' according to ASCII table
        while (control){
            for ( int i = 0 ; i<message.length() ; i ++){ // loop starting
                // there is a control loop to is it letter or something
                if ( (int)message.charAt(i) >65  && (int)message.charAt(i)<90  )  //control depend on ascı code
                {
                    control = false; // to exit from while loop
                    break; // to exit from if
                }else{
                    System.out.println("Invalid message.Try again!");
                    control = true; // loop contniue
                    message = scan.nextLine(); // taking message again

                }
            }
        }

        //i,"ü","ö","ç","ş","ğ" control. because our alphabet does not contain these letters

        while (true) {
            if (message.contains("ı") || message.contains("ü") || message.contains("ö") || message.contains("ç") || message.contains("ş") || message.contains("ğ")
                    || message.contains("İ") || message.contains("Ü") || message.contains("Ö") || message.contains("Ç") || message.contains("Ş") || message.contains("Ğ")) {

                System.out.println("Invalid message.Try again!");
                message = scan.nextLine();
            } else {
                break;
            }
        }

        //Control case is done.
    }

    public static void encryptedMessage() {

        Scanner scan = new Scanner(System.in);
        String encryptedMessage = "", decryptedMessage = "", lastMessage = "";
        int letterNumber;
        for (int i = 0; i < message.length(); i++) { // it is a loop to  convert ASCII code
            //We don't control ' ' letter.
            if (message.charAt(i) == ' ') // pass the character of ' '
            {
                encryptedMessage = encryptedMessage + " "; // adding space
                continue;
            }
            //ASCII code converter
            letterNumber = message.charAt(i) - 'A'; // extraction process for range 0 29
            encryptedMessage = encryptedMessage + letterNumber + " "; //adding numbers and space
        }
        System.out.println("Encrytpted version is: " + encryptedMessage);
        //decryted version  is done. Next, we will add +3 to encrypted version.
    }
    public static  void decryptedMessage () {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < message.length(); i++){
            //finding ASCII code from  X - A
            letterNumber = (char) (message.charAt(i) - 'A'); // to find is code among 0-29

            if(message.charAt(i) == ' '){ //if char is equals to ' ' we add ' '
                lastMessage+= ' ';
            }
            else{
                decryptedMessage = decryptedMessage + (letterNumber+3) + " "; // it is for print decrytep message
                letterNumber = ((letterNumber+3)%26) + (char)'A'; //to encrypted the character
                lastMessage += (char)letterNumber; // to creating last message as a string
            }
        }
        System.out.println("Decrypted version is: " + decryptedMessage);
    }
}
