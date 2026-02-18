import java.util.ArrayList;
import java.util.Arrays;

public class SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        matriz1 = preencherMatriz(matriz1);
        int[][] matriz2 = new int[2][2];
        matriz2 = preencherMatriz(matriz2);
        int[] nums = {10,20,30};
        System.out.println(Arrays.toString(nums));


    }
    public static int[][] preencherMatriz(int[][]matriz){
        for(int i =0; i< matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                matriz[i][j] =  0;
            }
        }
        return matriz;
    }
}
