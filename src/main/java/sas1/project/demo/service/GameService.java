package sas1.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas1.project.demo.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;
}
