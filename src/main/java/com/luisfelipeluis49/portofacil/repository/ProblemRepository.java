package com.luisfelipeluis49.portofacil.repository;

import com.luisfelipeluis49.portofacil.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}
