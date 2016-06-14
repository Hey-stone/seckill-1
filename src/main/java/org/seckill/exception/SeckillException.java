package org.seckill.exception;

/**
 * 所有秒杀相关的异常
 * Created by Administrator on 2016/5/27.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
