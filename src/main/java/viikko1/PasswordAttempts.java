package viikko1;
//import java.util.Scanner;

public class PasswordAttempts {
    public static String login(String[] tries) {
        // TODO
        String salasana = "java123";
        int yritykset = 3;
        //String syote = "";
        //Scanner keyboard = new Scanner(System.in); 
        int n = 0;
        while ((yritykset > 0) && (n < tries.length)) {
            System.out.println("Syota salasana: ");
            //syote = keyboard.nextLine();
            if (tries[n] == salasana){
                System.out.println("Tervetuloa!");
                //keyboard.close();
                return "Tervetuloa!";
            }
            n++;
            yritykset--;
        }

        return "Liian monta virheellistä yritystä.";

    }
}
