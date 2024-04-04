import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int maxSumPath(List<Integer> X, List<Integer> Y) {
        int m = X.size();
        int n = Y.size();
        int i = 0, j = 0;
        int sumX = 0, sumY = 0;
        int result = 0;

        while (i < m && j < n) {
            if (X.get(i) < Y.get(j)) {
                sumX += X.get(i++);
            } else if (X.get(i) > Y.get(j)) {
                sumY += Y.get(j++);
            } else {
                result += Math.max(sumX, sumY) + X.get(i);
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sumX += X.get(i++);
        }
        while (j < n) {
            sumY += Y.get(j++);
        }
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> X = new ArrayList<>();
        X.add(3);
        X.add(6);
        X.add(7);
        X.add(8);
        X.add(10);
        X.add(12);
        X.add(15);
        X.add(18);
        X.add(100);

        List<Integer> Y = new ArrayList<>();
        Y.add(1);
        Y.add(2);
        Y.add(3);
        Y.add(5);
        Y.add(7);
        Y.add(9);
        Y.add(10);
        Y.add(11);
        Y.add(15);
        Y.add(16);
        Y.add(18);
        Y.add(25);
        Y.add(50);

        int maxSum = maxSumPath(X, Y);

        System.out.println("The maximum sum path is: " + maxSum);
    }
}
