package com.csl.snowflake;

/**
 * @author MaoLongLong
 * @date 2021/4/22 下午1:49
 */
public class App {

    private static final int COUNT = 10;

    public static void main(String[] args) throws InterruptedException {
        IdWorker idWorker = new IdWorker(0, 0);
        for (int i = 0; i < COUNT; i++) {
            Thread.sleep(1);
            System.out.println(idWorker.nextId());
        }
    }
}
