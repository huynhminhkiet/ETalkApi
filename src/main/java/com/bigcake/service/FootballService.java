package com.bigcake.service;

import com.bigcake.model.FootballClub;
import com.bigcake.repository.FootballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bigcake on 8/26/2017
 */

@Service
public class FootballService {

    private final FootballRepository mFootballRepository;

    @Autowired
    public FootballService(FootballRepository mFootballRepository) {
        this.mFootballRepository = mFootballRepository;
    }

    public List<FootballClub> getFootballClubs() {
        return mFootballRepository.findAll();
    }
}
