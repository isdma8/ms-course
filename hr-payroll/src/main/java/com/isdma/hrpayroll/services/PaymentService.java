package com.isdma.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.isdma.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("", 200.0, days);
	}
}
