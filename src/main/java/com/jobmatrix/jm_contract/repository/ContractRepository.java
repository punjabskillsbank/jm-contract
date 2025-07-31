package com.jobmatrix.jm_contract.repository;

import com.jobmatrix.jm_contract.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
