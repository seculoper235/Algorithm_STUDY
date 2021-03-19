package Sort;

/* 퀵 정렬
 * 분할/정복 방식으로 정렬하는 방법으로, 가장 빠른 정렬이다
 * 그러나 그만큼 코드는 조금 복잡하며, Collection.sort()가 이 정렬을 부분 사용하고 있다
 * 평균 복잡도: n*logn, 최악: O(n^2)
 */
public class QuickSort implements AbstractSort {

    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length-1);
        return array;
    }

    void sort(int[] array, int start, int end) {
        // 길이가 0 인 부분은 정렬 종료
        if(end-start <= 0) {
        }

        else {
            /* 피봇 설정 */
            int pivot = array[(end+start)/2];

            int left = 0, right = 0;

            // 피봇 위치 결정(left--, right++)
            for (int i = start; i<=end; i++) {
                if(array[i] < pivot) {
                    left++;
                }
                else if(array[i] > pivot) {
                    right++;
                }
            }

            // 피봇 자리 확정
            System.out.println("end-right = " + (end-right) + ", (end+start)/2 = " + (end+start)/2 + "\n");
            int temp = array[end-right];
            array[end-right] = array[(end+start)/2];
            array[(end+start)/2] = temp;

            /* 분할 및 정복 */
            int l = 0, r = 0;
            for (int i = start; i<=end; i++) {
                if(array[i] < pivot && i>end-right) {
                    temp = array[start+l];
                    array[start+l] = array[i];
                    array[i] = temp;
                    l++;
                }
                else if(array[i] > pivot && i<end-right) {
                    temp = array[end-r];
                    array[end-r] = array[i];
                    array[i] = temp;
                    r++;
                }

                else if(left == l && right == r) {
                    break;
                }
            }

            /* 좌, 우 집합에 대해 정렬 실시 */
            // 좌측 부분
            sort(array, start, start+left-1);

            // 우측 부분
            sort(array, start+left+1, end);
        }
    }
}
