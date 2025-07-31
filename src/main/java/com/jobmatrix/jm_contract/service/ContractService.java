package com.jobmatrix.jm_contract.service;

import com.jobmatrix.jm_contract.dto.ContractDTO;
import org.springframework.stereotype.Service;


public interface ContractService {
    ContractDTO createContract(ContractDTO contractRequest);
}
