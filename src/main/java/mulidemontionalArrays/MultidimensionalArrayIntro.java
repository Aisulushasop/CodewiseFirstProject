package mulidemontionalArrays;

public class MultidimensionalArrayIntro {
    public static void main(String[] args) {

  /*
  2D arrays of arrays
   */
        int[] oneDimArr = new int[5];
        int[][]twoDimArr = new int[5][3];
        int[] oneDimArr2 = new int[]{1, 2, 3};
        int[][] twoDimArr2 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3}};

        int[] oneDimArr3 = new int[3];
        oneDimArr3[0] = 1;
        oneDimArr3[1] = 3;
        oneDimArr3[2] = 5;


        int[][] twoDimArr3 = new int[2][3];
        twoDimArr3[0][0] = 2;
        twoDimArr3[0][1] = 5;


        twoDimArr3[1][0] = 4;
        twoDimArr3[1][1] = 6;
        twoDimArr3[1][2] = 6;

   /*
   2d String Array
    */

        String[] strOneDim = new String[3];
        strOneDim[0] = " hello";  /// values
        strOneDim[1] = " you understand?";
        strOneDim[2] = "easy";
        String[] strOneDim2 = new String[]{"city", "state", "zip code"};
        String[][] strTwoDim1 = new String[][]{{"abc", "def", "xyz", ""}, {"qwe", "rty"}};

        String[][] strTwoDim2 = new String[3][4];
        strTwoDim2[0][0] = " hello";


        boolean boolArr[][] = {{true, true, true}, {false}};
        short[][] shortArr = new short[1][2];
        shortArr[0][0] = 10;
        shortArr[1][0] = 3;
        shortArr[1][1] = 90;


    }
}
