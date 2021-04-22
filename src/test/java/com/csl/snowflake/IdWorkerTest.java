package com.csl.snowflake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021/4/22 下午1:36
 */
class IdWorkerTest {

    @Test
    void testSnowflakeIdWorker() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
