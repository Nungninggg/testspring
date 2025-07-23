package com.example.testspring.repository;

import com.example.testspring.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Long> {
}