package com.example.demo2.pojo;

import java.time.LocalDateTime;

/**
 * ClassName:ActortAndCategory
 * Package:com.example.demo2.pojo
 * Description:
 *
 * @Author
 * @Create 2023/10/13 16:35
 * @Version 1.0
 */
public class ActortAndCategory {
    private Integer actor_id;
    private String first_name;
    private String last_name;
    private LocalDateTime last_update;

    private Integer category_id;

    private String name;

    public ActortAndCategory() {
    }

    public ActortAndCategory(Integer actor_id, String first_name, String last_name, LocalDateTime last_update, Integer category_id, String name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
        this.category_id = category_id;
        this.name = name;
    }

    public Integer getActor_id() {
        return actor_id;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ActortAndCategory{" +
                "actor_id=" + actor_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", last_update=" + last_update +
                ", category_id=" + category_id +
                ", name='" + name + '\'' +
                '}';
    }
}
