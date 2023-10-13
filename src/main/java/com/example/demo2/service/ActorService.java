package com.example.demo2.service;

import com.example.demo2.pojo.Actor;
import com.example.demo2.pojo.ActortAndCategory;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:ActorService
 * Package:com.example.demo.service
 * Description:
 *
 * @Author
 * @Create 2023/10/13 12:44
 * @Version 1.0
 */

public interface ActorService {




        //根据id来查询用户，并分页展示
        public List<Actor> listActorById(Integer actor_id);


        void add(Actor actor);

        void update(Actor actor);

        void del(Integer actor_id);


        List<ActortAndCategory> getAll();
}
