package com.jerocaller.JacocoStudy.service;

import org.springframework.stereotype.Service;

@Service
public class MathTool {
    public int getMax(int[] array) {
        int target = array[0];

        if (array.length <= 1) {
            return target;
        }

        for (int i = 1; i < array.length; ++i) {
            if (target < array[i]) {
                target = array[i];
            }
        }

        return target;
    }
}
