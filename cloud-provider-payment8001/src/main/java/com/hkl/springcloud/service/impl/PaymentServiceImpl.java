package com.hkl.springcloud.service.impl;


import com.hkl.springcloud.dao.PaymentDao;
import com.hkl.springcloud.entities.Payment;
import com.hkl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: HuangKL
 * @Date: 2020/06/09 00:44
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
