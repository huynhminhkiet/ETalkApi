package com.bigcake.repository;

import com.bigcake.model.FootballClub;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bigcake on 9/9/2017
 */
public interface FootballRepository extends MongoRepository<FootballClub, String>{

}
