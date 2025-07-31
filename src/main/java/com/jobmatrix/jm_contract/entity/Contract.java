package com.jobmatrix.jm_contract.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contracts")
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    @Column(name = "job_posting_id")
    private Long jobPostingId;

    @Column(name = "proposal_id")
    private Long proposalId;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "freelancer_id")
    private UUID freelancerId;

    @Column(name = "title")
    private String title;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "deadline_date")
    private LocalDate deadlineDate;

    @Column(name = "offer_expiry_date")
    private LocalDate offerExpiryDate;

    @Column(name = "weekly_hour_limit")
    private Integer weeklyHourLimit;

    @Column(name = "hourly_rate")
    private Integer hourlyRate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
