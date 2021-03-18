package Sort;

public class QuickSort_copy implements AbstractSort {
    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length-1);
    }

    public static int partition(int[] array, int left, int right) {
        // 피봇 선정
        int pivot = array[(left + right) / 2];

        // 분할 및 정복
        while (left < right) {
            // 피봇보다 작은 수의 개수
            while ((array[left] < pivot) && (left < right))
                left++;

            // 피봇보다 큰 수의 개수
            while ((array[right] > pivot) && (left < right))
                right--;


            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        return left;
    }

    public static void sort(int[] array, int left, int right) {

        // 배열의 길이(right-left)가 0이 되면 종료
        if (left < right) {
            int pivotIndex = partition(array, left, right);

            // 피봇 좌, 우로 분할 및 정복
            sort(array, left, pivotIndex - 1);
            sort(array, pivotIndex + 1, right);
        }
    }
}
