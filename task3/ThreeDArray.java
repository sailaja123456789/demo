package practice;

public class ThreeDArray {
    public static void main(String[] args) {
        // Declaration and instantiation of a 3D array
        int[][][] threeDArray = new int[2][3][4];

        // Initialization of array elements
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    threeDArray[i][j][k] = i + j + k;
                }
            }
        }

        // Access and print array elements
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
