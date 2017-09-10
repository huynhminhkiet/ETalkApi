package com.bigcake.controller;

import com.bigcake.model.FootballClub;
import com.bigcake.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bigcake on 8/26/2017
 */

@RestController
public class FootballController {

    private final FootballService mFootballService;

    @Autowired
    public FootballController(FootballService mFootballService) {
        this.mFootballService = mFootballService;
    }

    @RequestMapping("/footballClubs")
    public List<FootballClub> getFootballClubs() {
        return mFootballService.getFootballClubs();
    }
}
