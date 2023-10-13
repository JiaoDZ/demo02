package com.example.demo2.service;

import com.example.demo2.dao.ActorDao;
import com.example.demo2.pojo.Actor;
import com.example.demo2.pojo.ActortAndCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:ActorServiceImpl
 * Package:com.example.demo.service
 * Description:
 *
 * @Author
 * @Create 2023/10/13 12:48
 * @Version 1.0
 */
@Service//交由spring容器管理
public class ActorServiceImpl implements ActorService{
    @Autowired
    private ActorDao actorDao;

    //根据id来查询用户，并分页展示
    public List<Actor> listActorById(Integer actor_id){

        return actorDao.listActorById(actor_id);
    }


    public void add(Actor actor) {
        actorDao.add(actor);
    }


    public void update(Actor actor) {
       actorDao.update(actor);
    }


    public void del(Integer actor_id) {
        actorDao.del(actor_id);
    }


    public List<ActortAndCategory> getAll() {
        return actorDao.getAll();
    }

    ;



}
