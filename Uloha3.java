import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Nap´ıˇste kr´atky program na ktorom sa nauˇc´ıte inicializovaˇt novovytvoren´e pole:
 * - Inicializujte jednorozmern´e pole (sk´uskte pouˇziˇt google a vyhˇladaˇt java array
 * initialize) pevne dan´ymi hodnotami.
 * - Overte si spr´avnosˇt inicializ´acie hodnˆot pomocou v´ypisu na obrazovku podobne
 * ako v ´ulohe 2a.
 */
public class Uloha3 {
    public static void start(){
       int[] pole={1,2,4342,12,434,54,12,546};
       //Arrays.fill(pole,30);
       Arrays.sort(pole);
       for(int u:pole){
           System.out.print(""+u+" ");
       }
    }
}
