package com.isdma.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.isdma.hrpayroll.entities.Worker;

//Para usar o Feign temos de ter uma interface com as assinaturas das requisições que nós podemos fazer, neste caso feitas no worker


@Component
@FeignClient(name = "hr-worker"/*, url = "localhost:8001"*/, path = "/workers")
public interface WorkerFeignClient {
	
	
	@GetMapping(value="/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
