package org.example.day1y10.fanshi;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 86150
 * @date 2024/1/10 16:13
 */
public class Test6ArrayList {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("张三",1));
        users.add(new User("张三",2));

        Collections.sort(users);
        users.forEach(System.out::println);

    }
}
