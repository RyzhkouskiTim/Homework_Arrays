public class Second {
    public static void main(String[] args) {
        String[][] myArray = new String[8][8];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    myArray[i][j] = "W";
                } else {
                    myArray[i][j] = "B";
                }
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
