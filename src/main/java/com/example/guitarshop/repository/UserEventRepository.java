package com.example.guitarshop.repository;

import com.example.guitarshop.model.UserEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserEventRepository extends MongoRepository<UserEvent, String> {

    @Query("{ 'userId' : ?0 }")
    List<UserEvent> findAllByUserId(String userId);

}
