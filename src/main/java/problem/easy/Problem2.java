package problem.easy;

import java.util.List;

// todo 다시 풀기
public class Problem2 {

    /**
     * 주어진 정수 리스트의 각 요소를 제곱하여 새로운 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 각 요소를 제곱한 새 리스트
     */
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> (int) (Math.pow(n, 2)))
                .boxed()
                .toList();
    }
}