package com.cice.demoGestionPagos.service.impl;

import com.cice.demoGestionPagos.controller.dao.PaymentDTO;
import com.cice.demoGestionPagos.repository.Entity.PaymentEntity;
import com.cice.demoGestionPagos.repository.PaymentRepository;
import com.cice.demoGestionPagos.service.PaymentService;
import com.cice.demoGestionPagos.service.converter.PaymentDTOToPaymentEntityConverter;
import com.cice.demoGestionPagos.service.converter.PaymentEntityToPaymentDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public PaymentDTO generatePayment(PaymentDTO paymentDTO) {
        PaymentDTO generatedPaymentDTO = null;
        PaymentEntity paymentEntity = PaymentDTOToPaymentEntityConverter.convert(paymentDTO);
        paymentEntity = paymentRepository.save(paymentEntity);
        generatedPaymentDTO = PaymentEntityToPaymentDTOConverter.convert(paymentEntity);
        return generatedPaymentDTO;
    }
}
