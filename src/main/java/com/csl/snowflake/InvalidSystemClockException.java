package com.csl.snowflake;

/**
 * @author MaoLongLong
 * @date 2021/4/22 下午1:26
 */
public class InvalidSystemClockException extends RuntimeException {

    public InvalidSystemClockException(String message) {
        super(message);
    }
}
