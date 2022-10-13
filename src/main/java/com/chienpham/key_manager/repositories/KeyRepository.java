package com.chienpham.key_manager.repositories;

import com.chienpham.key_manager.models.Key;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyRepository extends JpaRepository<Key, Long> {


}
