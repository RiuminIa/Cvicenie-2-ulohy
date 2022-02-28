import java.text.ParseException;
import java.util.Scanner;

/**
 * 2.1 Uloha: Z´akladn´a syntax 2 ´
 * Vytvorte program, ktor´y vyp´ıˇse na obrazovku znamenie v horoskope. Vstupom
 * do programu je v´aˇs d´atum narodenia (deˇn a mesiac) a v´ystupom je v´ypis znamenia na obrazovku.
 * POMOCKA: ˆ
 * - Pouˇzite if - else if - else a switch - case konˇstrukciu.
 * - Nap´ıˇste si pomocn´u met´odu, ktor´a, na z´aklade d´atumu, vr´ati ˇc´ıslo reprezentuj´uce znamenie v horoskope .
 * - Vyuˇzite t´uto met´odu v Main met´ode.
 * - Vytvorte MENU, pomocou ktor´eho budete mˆocˇt opakovane zisˇtovaˇt znamenia
 * alebo ukonˇc´ıte program
 */
public class Uloha1 {
    public static void start() {
        //System.out.println("Enter your date (format dd.mm)");
        Scanner scan=new Scanner(System.in);
        int dd;
        int mm;
        String a;
        while (true) {
            System.out.println("Enter your date (format dd.mm) or type exit");
            a = scan.nextLine();
            if (a.equals("exit")){
                break;
            }
            dd = Integer.parseInt(a.substring(0, 2));
            mm = Integer.parseInt(a.substring(3, 5));
            switch (mm) {
                case 1:
                    if (dd <= 20) {
                        System.out.println("Kozoroh");
                        break;
                    }
                case 2:
                    if (mm == 1 || dd <= 20) {
                        System.out.println("Vodnar'");
                        break;
                    }
                case 3:
                    if (mm == 2 || dd <= 20) {
                        System.out.println("Ryby");
                        break;
                    }
                case 4:
                    if (mm == 3 || dd <= 20) {
                        System.out.println("Beran");
                        break;
                    }
                case 5:
                    if (mm == 4 || dd <= 21) {
                        System.out.println("Byk");
                        break;
                    }
                case 6:
                    if (mm == 5 || dd <= 21) {
                        System.out.println("Blineci");
                        break;
                    }
                case 7:
                    if (mm == 6 || dd <= 22) {
                        System.out.println("Rak");
                        break;
                    }
                case 8:
                    if (mm == 7 || dd <= 22) {
                        System.out.println("Lev");
                        break;
                    }
                case 9:
                    if (mm == 8 || dd <= 22) {
                        System.out.println("Panna");
                        break;
                    }
                case 10:
                    if (mm == 9 || dd <= 23) {
                        System.out.println("Vaha");
                        break;
                    }
                case 11:
                    if (mm == 10 || dd <= 22) {
                        System.out.println("Stir");
                        break;
                    }
                case 12:
                    if (mm == 11 || dd <= 21) {
                        System.out.println("Strelec");
                        break;
                    }
                default:
                    System.out.println("kozoroh");
                    break;
            }
        }
    }
}
