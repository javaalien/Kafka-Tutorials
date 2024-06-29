package com.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
