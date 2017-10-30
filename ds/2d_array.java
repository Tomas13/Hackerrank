
    public class Arrays2DDS {
        public static void main(String[] args) {
            int[][] array2D = new int[6][6]; //constraint
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    array2D[i][j] = scanner.nextInt();
                }
            }
        /*    //foreach to print 2d array
            for (int[] row : array2D) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
    
                System.out.println("");
            }
    */
            Sum(array2D);
        }
        private static void Sum(int arr[][]) {
            //ROw
            int sum = -1000;
            for (int i = 0; i < 4; i++) {
                for (int x = 0; x < 4; x++) {
                    int top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2];
                    int middle = arr[i + 1][x + 1];
                    int bottom = arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2];
                    if (top + middle + bottom > sum) {
                        sum = top + middle + bottom;
                    }
                }
            }
            System.out.println(sum);
        }
    }

