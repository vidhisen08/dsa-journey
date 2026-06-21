public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = matrix[j][low];
                matrix[j][low] = matrix[j][high];
                matrix[j][high] = temp;
                low++;
                high--;
            }
        }

    }
}
