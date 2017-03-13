package com.recruit.vo;

/**
 * Created by lishaoyong on 17/3/12.
 */
public class Category {

    private int id;

    private String categoryName;

    private int createAt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCreateAt() {
        return createAt;
    }

    public void setCreateAt(int createAt) {
        this.createAt = createAt;
    }
}
