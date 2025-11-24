import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej du ska skapa en skola!");

        System.out.println("Skapa elever, ange följande uppgifter om din första elev:");
        boolean continueElev = true;
        int elevNummer = 0;
        Elev[] elever = new Elev[3];
        while (continueElev) {

            System.out.println("Ange elevnamn");
            String elevNamn = scanner.nextLine();
            System.out.println("Ange elev personnummer:");
            int elevPerNum = scanner.nextInt();
            String[] elevKurser = { "Matte1", "Fysik 2", "projg 1" };
           
            elever[elevNummer] = new Elev(elevNamn, elevPerNum, "Studerande", "TE23D", elevKurser);

            scanner.nextLine();
            System.out.println("Vill du lägga till ytterligare en elev? Ja eller Nej");
            String svar = scanner.nextLine();
            if (svar.toLowerCase().equals("ja") && elevNummer <= 4) {
                continueElev = true;
                elevNummer++;
            } else if (svar.toLowerCase().equals("ja") && elevNummer > 4) {
                continueElev = false;
            }else{
                continueElev = false;
            }
        }

        for (int i = 0; i < elevNummer + 1; i++) {
            System.out.println(elever[i].toString());
        }
    }
}
