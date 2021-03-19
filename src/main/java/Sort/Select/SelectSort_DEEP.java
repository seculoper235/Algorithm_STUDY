package Sort.Select;

import Sort.AbstractSort;

/* 1. 깊은 복사
 * 깊은 복사를 한 후, 복사된 값을 넘겨주는 방법인데,
 * 코드가 지저분하고, for 문을 돌 때마다 깊은 복사가 일어나므로 비효율적이다
 */

public class SelectSort_DEEP implements AbstractSort {
    public int[] sort(int[] array) {
        int temp;
        for (int i=0; i< array.length; i++) {
            // 깊은 복사
            int[] copy_arr = array.clone();
            // 최소값 인덱스
            int min = min(copy_arr, i);

            // 최소값과 교환
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static int min(int[] array, int start) {
        // 최소값 요소의 인덱스
        int result = start;

        for (int j=start+1; j<array.length; j++) {
            if(array[start] > array[j]) {
                array[start] = array[j];
                result = j;
            }
        }
        return result;
    }
}
