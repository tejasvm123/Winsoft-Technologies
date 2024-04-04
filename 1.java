public class Main {
    public static void merge(int[] X, int[] Y, int m, int n) {
        int k = m + n + 1;
        while (m >= 0 && n >= 0) {
            if (X[m] > Y[n]) {
                X[k--] = X[m--];
            } else {
                X[k--] = Y[n--];
            }
        }
        while (n >= 0) {
            X[k--] = Y[n--];
        }

        for (int i = 0; i < n; i++) {
            Y[i] = 0;
        }
    }

    public static void rearrange(int[] X, int[] Y, int m, int n) {
        if (m == 0) {
            return;
        }

        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }

        merge(X, Y, k - 1, n - 1);
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        int m = X.length;
        int n = Y.length;

        rearrange(X, Y, m, n);
        for (int i = 0; i < m; i++) {
            System.out.print(X[i] + " ");
        }
    }
}
