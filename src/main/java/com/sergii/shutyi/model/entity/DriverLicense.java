package com.sergii.shutyi.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DriverLicense {
    private List<Category> categories = new ArrayList<Category>();

    public DriverLicense() {
    }

    public DriverLicense(List<Category> categories) {
        this.categories = categories;
    }

    public DriverLicense(Category category) {
        this.categories.add(category);
    }

    public enum Category {A, B, C, D, E}

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    @Override
    public String toString() {
        return "DriverLicense{" +
                "categories=" + categories +
                '}';
    }
}
