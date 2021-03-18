package Sort.Select;

import Sort.AbstractSort;

/* 선택 정렬
 * 현재 있는 값과 다음 순서의 값을 차례대로 비교하여, 가장 작은 값을 맨 앞으로 밀어버리는 정렬
 * 버블 정렬과 마찬가지로 구현이 간단하지만, 효율적이진 않다
 * 시간 복잡도 : 평균, 최악 모두 O(n^2)이다
 */

/* 2. 얕은 복사
 * 복사를 하지 않고, 대신 min() 메소드를 수정한다
 * 깊은 복사보다 효율적이고, 가독성도 좋다
 */

public class SelectSort implements AbstractSort {
    public void sort(int[] array) {

        for (int i=0; i< array.length; i++) {
            exChange(array, i);
        }
    }

    // 배열의 주소값을 넘겨받으므로, 참조가 일어남
    public static void exChange(int[] array, int start) {
        int temp;
        for (int j=start+1; j<array.length; j++) {
            // 최소값과 교환
            if(array[start] > array[j]) {
                temp = array[start];
                array[start] = array[j];
                array[j] = temp;
            }
        }
    }
}
