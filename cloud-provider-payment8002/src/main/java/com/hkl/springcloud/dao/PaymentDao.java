package com.hkl.springcloud.dao;

import com.hkl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: HuangKL
 * @Date: 2020/06/09 00:29
 */
@Mapper
public interface PaymentDao {


    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
