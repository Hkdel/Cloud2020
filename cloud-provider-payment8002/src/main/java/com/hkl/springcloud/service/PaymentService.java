package com.hkl.springcloud.service;

import com.hkl.springcloud.entities.Payment;

/**
 * @Description:
 * @Author: HuangKL
 * @Date: 2020/06/09 00:43
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
