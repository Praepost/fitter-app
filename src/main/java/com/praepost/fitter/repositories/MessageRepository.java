package com.praepost.fitter.repositories;

import com.praepost.fitter.entitys.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}
