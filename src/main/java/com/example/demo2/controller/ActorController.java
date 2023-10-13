package com.example.demo2.controller;

import com.example.demo2.pojo.Actor;
import com.example.demo2.pojo.ActortAndCategory;
import com.example.demo2.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:ActorController
 * Package:com.example.demo.controller
 * Description:
 *
 * @Author
 * @Create 2023/10/13 12:55
 * @Version 1.0
 */
@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;

    /**
     * 多表联查
     */
    @GetMapping("/actor")
    public List<ActortAndCategory> getAll(){
        return actorService.getAll();
    }

    @GetMapping("/user")
    public List<Actor> index(Integer actor_id){
        return actorService.listActorById(actor_id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Actor actor){
        actorService.add(actor);

    }
    @PutMapping("/up")
    public void update(@RequestBody Actor actor){
       actorService.update(actor);
    }
    @DeleteMapping("del")
    public void del(@RequestParam Integer actor_id){
         actorService.del(actor_id);
    }
}
