package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Gromov"));
        users.add(new User(2, "Jij"));
        users.add(new User(1, "Gromov"));

        HashSet<User> set = new HashSet<>(users);
        System.out.println(set);
    }
}
