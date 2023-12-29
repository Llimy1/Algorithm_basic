package math_set;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("== 집합 연산 ==");

        // 2-1 교집합
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4 ,5));
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8 ,10));
//        a.retainAll(b);
//        System.out.println("교집합: " + a);

        // 2-2 합집합
//        a.addAll(b);
//        System.out.println("합집합: " + a);

        // 2-3 차집합
        a.removeAll(b);
        System.out.println("차집합: " + a);
    }
}
