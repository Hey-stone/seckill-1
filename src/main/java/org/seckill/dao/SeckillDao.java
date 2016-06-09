package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/5/26.
 */
public interface SeckillDao {

    /**
     * 减库存，
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新的记录数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id查询
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("offset") int limit);
}