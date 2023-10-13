package com.example.demo2.dao;

import com.example.demo2.pojo.Actor;
import com.example.demo2.pojo.ActortAndCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName:ActorDao
 * Package:com.example.demo.dao
 * Description:
 *
 * @Author
 * @Create 2023/10/13 11:31
 * @Version 1.0
 */
@Mapper
public interface ActorDao {
    //查询所有用户
    List<Actor> listActor();
    @Select("select * from actor where actor_id=#{actor_id}")
    //根据id来查询用户，并分页展示
    List<Actor> listActorById(Integer actor_id);


    @Insert("insert into actor (actor_id,first_name,last_name,last_update) values (#{actor_id},#{first_name},#{last_name},#{last_update})")
    void add(Actor actor);

    @Update("update actor set first_name = #{first_name} where actor_id = #{actor_id}")
    void update(Actor actor);

    @Delete("delete from actor where actor_id = #{actor_id}")
    void del(Integer actor_id);

    @Select("select * from actor, category where actor_id = category_id")
    List<ActortAndCategory> getAll();
}
