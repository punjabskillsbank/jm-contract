package com.jobmatrix.jm_contract.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
public class ContractDTO {
    private Long jobPostingId;
    private Long proposalId;
    private UUID clientId;
    private UUID freelancerId;
    private String title;
    private Long amount;
    private LocalDate startDate;
    private LocalDate deadlineDate;
    private LocalDate offerExpiryDate;
    private Integer hourlyRate;
    private Integer weeklyHourLimit;
}
