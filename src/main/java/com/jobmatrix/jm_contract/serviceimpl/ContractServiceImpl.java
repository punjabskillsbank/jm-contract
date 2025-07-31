package com.jobmatrix.jm_contract.serviceimpl;

import com.jobmatrix.jm_contract.dto.ContractDTO;
import com.jobmatrix.jm_contract.entity.Contract;
import com.jobmatrix.jm_contract.repository.ContractRepository;
import com.jobmatrix.jm_contract.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public ContractDTO createContract(ContractDTO contractRequest) {

        Contract contract = modelMapper.map(contractRequest, Contract.class);
        contract.setContractId(null);
        Contract savedContract = contractRepository.save(contract);
        return modelMapper.map(savedContract, ContractDTO.class);

    }
}
