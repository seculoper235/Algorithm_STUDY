package DataStructure;

import java.util.Scanner;

public class RecursiveTest {
    // 과정: result * i(1~n), i값이 계속 증가해야 함
    // ==> 반복 과정: result *= i, i++
    // ==> 전역(계속 변하는 값): result, i
    // ==> 지역(계속 동일한 값): 없음
    public static int factorial(int result, int n, int mul) {
        /* 재귀에 진입하면서 진행할 과정 */
        /* 반복되는 과정과 재귀 종료 시점을 작성한다 */
        // 재귀를 끝내는 시점
        if(mul == n)
            return result;
        // 지역 변수(매번 초기화되는 값)
        // 반복 진행 과정(매번 동일하게 진행되며, 전역변수 값을 바꿈)
        //result *= mul;
        mul++;
        System.out.println("result = " + result);
        /* 재귀 실행 */
        // 전역 변수
        return factorial(result, n, mul) * mul;
        /* 재귀에서 빠져나올 떄 진행할 과정 */
        /* 동일하게 반복되는 과정을 작성할 수 있다. 보통 그냥 return하긴 한다 */
        // 아무것도 없으므로, 가장 처음 리턴된 result가 그대로 반환된다
    }

    // 과정: result = i + i2 (i = 1 ~ n)
    // 변하는 값: i, i2
    // 변하지 않는 값: 없음
    //  1, 0, 3, 1
    public static int fibonacci(int cur, int prev, int n) {
        /* 재귀를 진행하는 부분 */
        // 반복되는 과정
        int result = cur + prev;
        n--;
        System.out.println("result = " + result);

        // 재귀 종료 시점
        if(n == 0) {
            return result;
        }

        // 반복되는 과정
        prev = cur;
        cur = result;

        // 재귀 진행
        return fibonacci(cur, prev, n);
    }

    public static int fibonacci(int n) {
        if(n ==1)
            return 1;
        else
            return fibonacci(1, 0, n-1);
    }

    // 반복 과정 : 0제거, 길이 -> 2진법 -> 문자열
    public static int[] binaryFunc(String s, int[] answer) {
        if(s.equals("1")) {
            return answer;
        }

        // 0제거
        String result = "";
        int one = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                result += s.charAt(i);
                one++;
            }
        }
        one = s.length() - one;

        // 길이 -> 이진법 -> 문자열
        int len = result.length();
        s = Integer.toBinaryString(len);

        // 결과값 정리
        answer[0]++;
        answer[1] += one;

        /* 재귀 실행 */
        return binaryFunc(s, answer);
    }
    public static int[] solution(String s) {
        int[] answer = new int[2];
        return binaryFunc(s, answer);
    }

    // 011, 101, 110
    //

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //int result = fibonacci(num);
        //int result = factorial(1, num, 1);

        //System.out.println(result);
        String s = "110010101001";
        int[] answer = solution(s);
        System.out.println("answer = [" + answer[0]+ ", " +answer[1]+ "]");
    }
}
