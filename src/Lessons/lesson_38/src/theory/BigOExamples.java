package Lessons.lesson_38.src.theory;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Big O нотация нужна для описания сложности алгоритмов.
 * Под "временем" подразумевается количество операций, каждая из этих операций выполняется за единицу времени.
 * <p>
 * ниже приведены сложность алгоритмов в зависимости от размера входящих данных от наилучшего к наихудшему:
 *<p>
 *  O(1) - O(1) можно прочитать как «сложность порядка 1» (order 1), или «алгоритм выполняется за постоянное/константное
 * время» (constant time). <p>
 *  O(log n) - логарифмическая сложность<p>
 *  O(n) - линейная сложность<p>
 *  O(n log n) - n-логарифимическая сложность<p>
 *  O(n^2) - квадратичная сложность<p>
 *  O(n^3 ... n) - n - любое число<p>
 *  O(2^n) - экспоненциальная или n-степенная сложность<p>
 *  O(n!) - факториальная сложность<p>
 *
 */
public class BigOExamples {
    public static void main(String[] args) {

    }


    // 0(1)
    static int getLastElem(int[] nums) {
        return nums[nums.length - 1];
    }


    // O(n)  O(n + 1) -> O(n)
    static int getSumOfElem(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // 100 lines of code == const
        }
        return sum;
    }


    // O(n/2) -> O(n)
    static int getSumOfHalfElem(int[] nums) {
        int step = 0;

        int sum = 0;
        step++;
        for (int i = 0; i < nums.length/2; i++) {
            sum += nums[i];
            step++;
        }
        return sum;
    }


    // N N -> O(2N) -> O(N)
    static void getSumOfHalfElem(int[] nums1, int[] nums2) {
        int step = 0;


        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
            step++;
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
            step++;
        }
    }


    // O(n * m) -> n == m -> O (n * n) -> O(n^2)
    static void nestedLoop(int[] nums1, int[] nums2) {
        int step = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                System.out.println(nums2[j]);
                step++;
            }
        }
    }


    // O(n + n^2) -> O(n^2)
    static void someMethod(int[] nums1, int[] nums2) {
        int sum = 0;// 1
        for (int i = 0; i < nums1.length; i++) {
            sum += nums1[i];
        }


        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                System.out.println(nums2[j]);
            }
        }
    }



    // {   {1, 2, 3}, {-4, -3, 2}, {80, 90, 1000}     }
    static void findElement(int[][] nums, int element) { // 90 - nums[2][1]
        // O(n * log n)
        for (int i = 0; i < nums.length; i++) {
            int[] innerArray = nums[i];
            // binary search in innerArray O(logN)
        }


    }









    static boolean isContainsBinaryImplementationRecursion(int[] sortedArray, int x) {
        int mid = sortedArray.length / 2;

        if (x == mid) {
            return true;
        } else if (x>= sortedArray[0] && x < sortedArray[mid]) {
            int[] firstHalf = Arrays.copyOfRange(sortedArray, 0, mid);
            return isContainsBinaryImplementationRecursion(firstHalf, x);
        } else if (x > mid && x <= sortedArray[sortedArray.length - 1]) {
            int[] secondHalf = Arrays.copyOfRange(sortedArray, mid, sortedArray.length);
            return isContainsBinaryImplementationRecursion(secondHalf, x);
        }
        return false;
    }

    // O(n)
    static boolean isContainsLineaImplementation(int[] sortedArray, int x) {

        for(int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == x) {
                return true;
            }
        }
        return false;
    }


    static void mergeSort(int arr[], int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l; //
        while (i < n1 && j < n2) { //
            if (L[i] <= R[j]) { //
                arr[k] = L[i]; //
                i++; // 1
            }
            else {
                arr[k] = R[j]; //
                j++; // 4
            }
            k++; // 5
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) { //
            arr[k] = R[j]; //
            j++;
            k++;
        }
    }


    // O(n * m) -> O(n^2)  [[2, 3],  [4, 5],   [6, 7]]
    static void printDoubleArray(int[][] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ?
    static int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    //O(n!)
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue;
                }
                tempList.add(nums[i]);

                // рукурсивный вызов, метод вызывает сам себя, что увеличивает мложность по занимаемой памяти -
                // space capacity
                backtrack(nums, result, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
