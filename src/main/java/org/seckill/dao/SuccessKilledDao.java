package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by Administrator on 2016/5/26.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckill
     * @param userPhone
     * @return
     * 插入的行数
     */
    int insertSuccessKilled(long seckill, long userPhone);

    /**
     * 根据id查询Succeesskilled并携带秒杀商品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
