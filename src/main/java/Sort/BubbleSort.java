package Sort;

/* 버블정렬
 * 현재 있는 값과 다음 순서의 값을 비교하여, 큰 값을 뒤로 밀어버리는 정렬
 * 시간 복잡도 : O(n^2)이고 가장 단순한 정렬증 하나이다
 */
public class BubbleSort {
    // 정렬 메소드
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-i-1; j++) {
                // 현재와 다음 인덱스 비교
                if(array[j] > array[j+1]) {
                    // 현재 인덱스 값이 더 크므로, 다음 인덱스와 교환
                    int temp = array[j];
                    array[j+1] = array[j];
                    array[j+1] = temp;
                }
            }
        }
    }
}
