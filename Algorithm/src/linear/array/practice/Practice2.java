package linear.array.practice;

// Practice2
// 배열 arr 에서 target 에 해당하는 값의 인덱스를 출력
// 해당 값이 여러 개인 경우 가장 큰 인덱스 출력

// 입출력 예시)
// 배열 arr: 1, 1, 100, 1, 1, 1, 100
// 결과: 6
public class Practice2 {

    public static int bigIndex(int[] arr, int target) {
        int result = 0;

        for (int i = arr.length -1; i >= 0; i--) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;

        System.out.println(bigIndex(arr, target));
    }

}
