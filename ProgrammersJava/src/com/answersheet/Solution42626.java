package com.answersheet;

import java.util.PriorityQueue;

class Solution42626 {
    public int solution(int[] scoville, int K) {
        int answer = -1;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : scoville){
            heap.offer(num);
        }

        int min = heap.peek();

        for(int i=0; i<scoville.length; i++){
            if(i>0&& heap.size()>1){
                int num1 = heap.poll();
                int num2 = heap.poll();
                heap.offer(num1 + num2*2);
            }
            min = heap.peek();

            if(min >= K){
                return i;
            }
        }

        return answer;
    }
}