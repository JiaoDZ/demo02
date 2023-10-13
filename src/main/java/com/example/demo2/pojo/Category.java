package com.example.demo2.pojo;

import java.time.LocalDateTime;

/**
 * ClassName:Category
 * Package:com.example.demo2.pojo
 * Description:
 *
 * @Author
 * @Create 2023/10/13 16:32
 * @Version 1.0
 */
public class Category {
    private Integer categoryId;

    private String name;

    private LocalDateTime lastUpdate;

    public Category() {
    }

    public Category(Integer categoryId, String name, LocalDateTime lastUpdate) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
