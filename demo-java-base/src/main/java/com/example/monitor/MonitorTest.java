package com.example.monitor;

import org.springframework.util.StopWatch;

public class MonitorTest {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
// 开始时间
        stopWatch.start();
// 执行时间（1s）
        Thread.sleep(1030L);
// 结束时间
        stopWatch.stop();
// 统计执行时间（秒）
        System.out.printf(String.valueOf(stopWatch.getTotalTimeSeconds())); // %n 为换行


        double aa=12.345d;
        int cc= (int) aa;
        System.out.println(cc);

    }
}
