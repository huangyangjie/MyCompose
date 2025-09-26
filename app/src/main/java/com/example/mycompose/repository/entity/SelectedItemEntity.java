package com.example.mycompose.repository.entity;

public class SelectedItemEntity {
    public SelectedItemEntity(){}
    public SelectedItemEntity(String name,String id,boolean isSelected){
        this.name = name;
        this.id = id;
        this.isSelected = isSelected;
    }
    String name;
    String id;
    boolean isSelected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
