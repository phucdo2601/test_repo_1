package com.phucdn.learnSpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucdn.learnSpringSecurity.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, String> {

}
