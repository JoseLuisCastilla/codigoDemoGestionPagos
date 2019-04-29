package com.cice.demoGestionPagos.service;

import com.cice.demoGestionPagos.controller.dao.PaymentDTO;

public interface PaymentService {
    /**
     * Método que va a generar un uuid de transacción para cada usuario que se reciba.
     * @param paymentDTO
     * @return PaymentDTO
     */

    PaymentDTO generatePayment(PaymentDTO paymentDTO);
}
