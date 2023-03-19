package com.example.votinginterviewapp.business.candidate.control;

import com.example.votinginterviewapp.business.candidate.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
