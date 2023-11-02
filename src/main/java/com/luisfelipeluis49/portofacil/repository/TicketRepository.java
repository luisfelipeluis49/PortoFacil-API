package com.luisfelipeluis49.portofacil.repository;

import com.luisfelipeluis49.portofacil.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
