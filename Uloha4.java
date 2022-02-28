import java.util.Arrays;

/**
 * Uloha: V´ypoˇcet determinantu ˇstvorcovej matice 3x3 ´
 * Vyuˇzite sk´usenosti z ´ulohy 4 na naplnenie 2-rozmern´eho poˇla cel´ych ˇc´ısel.
 * Viac inform´aci´ı o v´ypoˇcte determinantu WIKI
 */
public class Uloha4 {
    public static void start(){
        int[][] matrix= {{1,2,3},{2,4,5},{-1,5,6}};
        int[] tempMinors=new int[3];
        int znak = 1;
        int[] sirka = {1,2};
        for(int i=0;i<3;i++){
            if (i%2!=0){
                tempMinors[i]=znak*matrix[0][i]*((matrix[1][0]*matrix[2][2])-(matrix[2][0]*matrix[1][2]));
            }
            else {
                tempMinors[i] = znak * matrix[0][i] * ((matrix[1][(i + 1) % 3] * matrix[2][(i + 2) % 3]) - (matrix[2][(i + 1) % 3] * matrix[1][(i + 2) % 3]));
            }
            znak=-1*znak;
        }
        System.out.println(Arrays.stream(tempMinors).sum());
    }
}
