package com.cice.demoGestionPagos.service.converter;

import com.cice.demoGestionPagos.controller.dao.PaymentDTO;
import com.cice.demoGestionPagos.repository.Entity.PaymentEntity;

import java.util.Date;
import java.util.UUID;

public class PaymentDTOToPaymentEntityConverter {

    public static PaymentEntity convert(PaymentDTO paymentDTO){
        PaymentEntity paymentEntity = null;
        paymentEntity = new PaymentEntity()
                .setCreateDate(new Date().toString())
                .setPaymentTransactionId(UUID.randomUUID().toString())
                .setUserId(paymentDTO.getStudentId())
                .setPaymentAmount(paymentDTO.getAmount());

        return paymentEntity;
    }
}
