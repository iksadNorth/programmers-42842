package org.example;

class Solution {
    public int[] solution(int brown, int yellow) {
        for(int b=1; b*b<=yellow; b++) {
            if(yellow % b != 0) continue;

            int a=yellow/b;
            if(brown == 2*(a+b)+4) return new int[]{a+2,b+2};
        }
        return new int[]{0,0};
    }
}