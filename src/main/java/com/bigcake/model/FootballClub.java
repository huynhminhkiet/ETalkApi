package com.bigcake.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Bigcake on 8/26/2017
 */

@Document(collection = "football")
public class FootballClub {

    @Id
    private String id;
    private String name;
    private int coach;

    public FootballClub() {
    }

    public FootballClub(String name, int coach) {
        this.name = name;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoach() {
        return coach;
    }

    public void setCoach(int coach) {
        this.coach = coach;
    }
}
