package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhn
 * @email 865895777@qq.com
 * @date 2024-06-14 01:09:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
