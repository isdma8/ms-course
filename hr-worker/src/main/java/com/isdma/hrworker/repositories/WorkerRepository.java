package com.isdma.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isdma.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
