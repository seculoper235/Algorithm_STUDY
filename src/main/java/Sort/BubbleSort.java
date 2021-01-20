package Sort;

/* 버블정렬
 * 현재 있는 값과 다음 순서의 값을 비교하여, 큰 값을 뒤로 밀어버리는 정렬
 * 시간 복잡도 : O(n^2)이고 가장 단순한 정렬증 하나이다
 */
public class BubbleSort {
    // 정렬 메소드
    public static void sort(int[] array) {
        // 중복 비교 방지를 위한 플래그
        boolean flag = true;

        // flag로 중복 교환 체크
        // (flag가 그대로 false 이면 교환이 필요없다는 뜻이므로, 정렬을 끝냄)
        for (int repeat=1; repeat<array.length && flag; repeat++) {
            // flag 초기화
            flag = false;

            for (int j=0; j<array.length-repeat; j++) {
                // 현재와 다음 인덱스 비교
                if(array[j] > array[j+1]) {
                    // 현재 인덱스 값이 더 크므로, 다음 인덱스와 교환
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

                    // 교환된 값은 true로 하여, 다시 비교하지 않도록 한다
                    flag = true;
                }
            }
        }
    }
}
