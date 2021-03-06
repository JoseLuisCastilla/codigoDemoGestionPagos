package com.cice.demoGestionPagos.controller.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PaymentDTO {

    private Long operationId;
    private String studentId;
    private String transactionId;
    private Double amount;
    private Boolean paymentStatus;
}
