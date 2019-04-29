package com.cice.demoGestionPagos.controller.resource;

import com.cice.demoGestionPagos.controller.dao.PaymentDTO;
import com.cice.demoGestionPagos.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {
    @Autowired
    PaymentService paymentService;
    @RequestMapping(path = "/payments ", method = RequestMethod.POST)
    public ResponseEntity<PaymentDTO> generatePayment(@RequestBody PaymentDTO paymentDTO){
        ResponseEntity<PaymentDTO> response = null;
        PaymentDTO payment = paymentService.generatePayment(paymentDTO);
        if(payment != null){
            response = ResponseEntity.ok(payment);
        }else{
            response = ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return response;
    }

}
