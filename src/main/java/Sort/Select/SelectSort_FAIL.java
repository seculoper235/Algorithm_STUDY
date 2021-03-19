package Sort.Select;

import Sort.AbstractSort;

/* 실패 원인
 * min(int[] array)로 배열을 넘겨줄 때, 주소값을 넘겨주기 때문에 "Call by Reference"가 일어난다
 * min() 내부의 작업이 실제 배열에 적용되기 때문에, 제대로 적용이 되지 않는 것이다
 * 이와 같은 경우 2가지 해결책이 있지만, 그냥 sort() 하나에 모두 구현하는 것이 좋다
*/
public class SelectSort_FAIL implements AbstractSort {
    // 정렬 메소드
    public int[] sort(int[] array) {
        int temp;

        /* 오류!
        * min() 메소드로 이미 교환이 일어났는데, 한번 더 교환함
        */
        for (int i=0; i< array.length; i++) {
            temp = array[i];
            array[i] = array[min(array, i)];
            array[min(array, i)] = temp;
        }
        return array;
    }

    // 최소값 구하기
    public static int min(int[] array, int start) {
        // 최소값 요소의 인덱스
        int result = 0;

        for (int j=start+1; j<array.length; j++) {
            if(array[start] > array[j]) {
                array[start] = array[j];
                result = j;
            }
        }
        return result;
    }
}
