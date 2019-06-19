

public class MultiArray {
    public static void main(String[]args) {

        int[][] rowAndCol = new int{0,1, 2, 3, 4, 5},
                                    ;

        for (int i = 0; i < 10; i++){
            for (int j=0; j<5; j++){
                rowAndCol[i][j] = i;
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j=0; j<5; j++){
                System.out.println("row " + rowAndCol[i][j]);
            }
        }
    }
}