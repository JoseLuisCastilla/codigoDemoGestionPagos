package com.cice.demoGestionPagos.service.converter;

import com.cice.demoGestionPagos.controller.dao.PaymentDTO;
import com.cice.demoGestionPagos.repository.Entity.PaymentEntity;

public class PaymentEntityToPaymentDTOConverter {
    public static PaymentDTO convert(PaymentEntity entity){
        PaymentDTO paymentDTO = null;
        new PaymentDTO()
                .setOperationId(entity.getPaymentId())
                .setStudentId(entity.getUserId())
                .setTransactionId(entity.getPaymentTransactionId())
                .setAmount(entity.getPaymentAmount())
                .setPaymentStatus(entity.getPaymentStatus());

        return paymentDTO;
    }
}
