package week06;

public class EncryptPassword {
    public static void main(String[] args) {
        String password = "cydeo";
        char encrpWithChar = 'x';
        String encryptedPassword = "";

        for(int i = 0; i< password.length() ; i++){

            encryptedPassword += ""+password.charAt(i)+encrpWithChar;

            System.out.println("encryptedPassword = " + encryptedPassword);

        }
    }
}
