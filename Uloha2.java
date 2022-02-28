import java.util.Scanner;

/**
 * Nap´ıˇste kr´atky program na ktorom sa nauˇc´ıte pracovaˇt s poˇlom:
 * - Definujte jednorozmern´e pole cel´ych ˇc´ısel ˇlubovolnej veˇlkosti.
 * - Naplˇnte cel´e pole ˇc´ıslami zadan´ymi z kl´avesnice.
 * - Overte si spr´avnosˇt naˇc´ıtan´ych hodnˆot pomocou v´ypisu na obrazovku
 */
public class Uloha2 {
    public static int[] start() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[10];
        String s;
        Scanner scan = new Scanner(System.in);
        s=scan.nextLine();
        Scanner scan2=new Scanner(s);
        int i=0;
        while (scan2.hasNextInt()){
            b[i]=scan2.nextInt();
            i++;
        }
        for (int w=0;w<i;w++){
            System.out.print(b[w]+" ");
        }
        return b;
    }
}
