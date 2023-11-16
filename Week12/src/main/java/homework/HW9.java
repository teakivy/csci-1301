package homework;

public class HW9 {
    public static void main(String[] args) {
        // Create the 2D array
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
        // Calculate & sort the array
        int[] sumArray = calculateSum(workHours);
        int[] indexArray = decreasingSort(sumArray);

        // Display the array
        displayArray(indexArray, sumArray);
    }

    /**
     * Calculate the sum of each row in the 2D array
     * @param workHours 2D array of work hours
     * @return array of sums
     */
    public static int[] calculateSum(int[][] workHours) {
        int[] sumArray = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }

    /**
     * Sort the array in decreasing order
     * @param sumArray array of sums
     * @return array of indices
     */
    public static int[] decreasingSort(int[] sumArray) {
        int[] indexArray = new int[sumArray.length];
        for (int i = 0; i < sumArray.length; i++) {
            indexArray[i] = i;
        }
        for (int i = sumArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sumArray[i] > sumArray[j]) {
                    int temp = sumArray[i];
                    sumArray[i] = sumArray[j];
                    sumArray[j] = temp;
                    temp = indexArray[i];
                    indexArray[i] = indexArray[j];
                    indexArray[j] = temp;
                }
            }
        }
        return indexArray;
    }

    /**
     * Display the array
     * @param indexArray array of indices
     * @param array array of sums
     */
    public static void displayArray(int[] indexArray, int[] array) {
        /*Please write your code here*/
        for (int i = 0; i < indexArray.length; i++) {
            System.out.println("Employee" + indexArray[i] + ": " + array[i] + " hours");
        }
    }
}
