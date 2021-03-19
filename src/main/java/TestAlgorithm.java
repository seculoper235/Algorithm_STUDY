import Sort.AbstractSort;
import Sort.QuickSort;
import Sort.QuickSort_copy;
import Sort.Select.SelectSort_FAIL;

import java.util.Arrays;

public class TestAlgorithm {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 9, 0, 15, 8, 4};

        // 알고리즘 돌려보기
        runSort(new QuickSort(), array);
    }

    public static void runSort(AbstractSort Sort, int[] array) {
        System.out.println("사용 알고리즘 : " +Sort.getClass().getSimpleName());
        System.out.println("정렬 전 :" +Arrays.toString(array));
        Sort.sort(array);
        System.out.println("정렬 후: " +Arrays.toString(array));
    }
}
