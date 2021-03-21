package com.example.zaslonchat;

public class User {

    private String name;
    private String email;
    private String id;
    private int avatarMockUpResource;

    public User() {
    }

    public int getAvatarMockUpResource(int ic_baseline_person_24) {
        return avatarMockUpResource;
    }

    public void setAvatarMockUpResource(int avatarMockUpResource) {
        this.avatarMockUpResource = avatarMockUpResource;
    }

    public User(String name, String email, String id, int avatarMockUpResource) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.avatarMockUpResource = avatarMockUpResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
