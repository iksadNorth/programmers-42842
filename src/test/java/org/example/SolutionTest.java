package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(int brown, int yellow, int[] answer) {
        // when
        int[] result = solution.solution(brown, yellow);

        // then
        Assertions.assertArrayEquals(result, answer);
    }

    @Test @DisplayName("1")
    void testcase1() {
        // given
        int brown=10, yellow=2;
        int[] answer = new int[]{4,3};

        // when & then
        assertAnswer(brown, yellow, answer);
    }
    @Test @DisplayName("2")
    void testcase2() {
        // given
        int brown=8, yellow=1;
        int[] answer = new int[]{3,3};

        // when & then
        assertAnswer(brown, yellow, answer);
    }
    @Test @DisplayName("3")
    void testcase3() {
        // given
        int brown=24, yellow=24;
        int[] answer = new int[]{8,6};

        // when & then
        assertAnswer(brown, yellow, answer);
    }
}