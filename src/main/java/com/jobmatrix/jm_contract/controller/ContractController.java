package com.jobmatrix.jm_contract.controller;

import com.jobmatrix.jm_contract.dto.ContractDTO;
import com.jobmatrix.jm_contract.service.ContractService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contracts")
@RequiredArgsConstructor
public class ContractController {


    @Autowired
    private ContractService contractService;

    @PostMapping("/create_contract")
    public ResponseEntity<ContractDTO> createContract(
            @Valid @RequestBody ContractDTO contractRequest) {
        ContractDTO savedContract = contractService.createContract(contractRequest);
        return new ResponseEntity<>(savedContract, HttpStatus.CREATED);
    }
}