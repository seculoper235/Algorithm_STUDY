package Sort;

/* 선택 정렬
 * 현 있는 값 다음 순서의 값을 차례대로 비교하여, 가장 작은 값을 맨 앞으로 밀어버리는 정렬
 * 버블 정렬과 마찬가지로 구현이 간단하지만, 효율적이진 않다
 * 시간 복잡도 : 평균, 최악 모두 O(n^2)이다
*/
public class SelectSort {
    // 정렬 메소드
    public static void sort(int[] array) {
        // 정렬 회차
        for (int i=0; i< array.length; i++) {
            array[i] = min(array, i);
        }
    }

    public static int min(int[] array, int start) {
        int result = array[start];

        for (int j=start+1; j<array.length; j++) {
            if(result > array[j]) {
                result = array[j];
            }
        }

        return result;
    }
}
