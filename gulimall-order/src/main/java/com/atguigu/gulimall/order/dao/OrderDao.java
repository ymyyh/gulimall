package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhn
 * @email 865895777@qq.com
 * @date 2024-06-14 01:15:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
