import Sort.BubbleSort;

import java.util.Arrays;

public class TestAlgorithm {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 9, 0, 7};

        // 알고리즘 돌려보기
        runSort(BubbleSort.class, array);
    }

    public static void runSort(Class sort, int[] array) {
        System.out.println("사용 알고리즘 : " +sort.getSimpleName());
        System.out.println("정렬 전 :" +Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println("정렬 후: " +Arrays.toString(array));
    }
}
