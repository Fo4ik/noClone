package com.company;

import java.util.Objects;

public class User {
    private int id;
    private String lastname;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public User(int id, String lastname) {
        this.id = id;
        this.lastname = lastname;
    }
}
