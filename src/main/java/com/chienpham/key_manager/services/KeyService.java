package com.chienpham.key_manager.services;

import com.chienpham.key_manager.models.Key;
import com.chienpham.key_manager.repositories.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyService {
    @Autowired
    KeyRepository keyRepository;

    public List<Key> list() {
        return this.keyRepository.findAll();
    }
}
