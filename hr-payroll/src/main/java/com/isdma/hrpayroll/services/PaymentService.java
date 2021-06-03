package com.isdma.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isdma.hrpayroll.entities.Payment;
import com.isdma.hrpayroll.entities.Worker;
import com.isdma.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	//@Value("${hr-worker.host}")
	//private String workerHost;
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		//Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", ""+workerId);
		
		//Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		Worker worker = workerFeignClient.findById(workerId).getBody();//corpo da resposta sim é do tipo worker
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
