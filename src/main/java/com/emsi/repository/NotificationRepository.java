package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.entity.Notification;



public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
}
