import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double kg;
        double m ;

        Scanner inp = new Scanner(System.in);



        System.out.println("Lütfen Kilonuzu giriniz :");
        kg = inp.nextDouble();


        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = inp.nextDouble();


        double VKI = (kg) / (m*m);
        System.out.println("Vücut Kitle İndeksiniz :" + VKI);
    }
}