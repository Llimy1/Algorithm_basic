package linear.array.practice;

// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

import java.util.Arrays;

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4
public class Practice6 {

    public static void removeDuplicate(int[] arr) {
        int[] arrResult = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < cnt; j++) {
                if (arr[i] == arrResult[j]) {
                    flag = true;
                }
            }

            if (flag == false) {
                arrResult[cnt++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arrResult));
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        removeDuplicate(arr);
    }
}
