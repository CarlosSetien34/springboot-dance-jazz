package com.example.jazzapp.domain.repository;

import com.example.jazzapp.domain.entity.Step;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StepRepository extends JpaRepository<Step, UUID> {
}
