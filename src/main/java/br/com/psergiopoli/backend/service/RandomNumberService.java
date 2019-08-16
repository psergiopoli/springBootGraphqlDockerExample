package br.com.psergiopoli.backend.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberService {

    public Long generateRandomNumber() {
        return new Random().nextLong();
    }
}
