package math.math_combination;

// 기초 수학 - 조합

public class Main {

    static int getCombination(int n, int r) {
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return pResult/rResult;
    }

    public static void main(String[] args) {
//      1. 조합
//      서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서 x, 중복 x)
//      nCr = n!/(n-r)!r! = nPr/r!
        System.out.println("== 조합 ==");

        int n = 4;
        int r = 2;

        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }

        System.out.println("result = " + pResult/rResult);



//      2. 중복 조합
//      서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서x, 중복o)
//      nHr = n+r-1Cr
        System.out.println("== 중복 조합 ==");
        n = 2;
        r = 3;

        System.out.println("결과 = " + getCombination(n + r - 1, r));


    }
}

