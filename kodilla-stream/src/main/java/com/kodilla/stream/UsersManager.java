package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> filteredByAgeUsers = filterUsersByAge();

        List<String> filteredWithoutPosts = usersWithoutPosts();
        System.out.println(filteredWithoutPosts);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists")) // [1]
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersByAge() {
        List<User> oldUsers = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 45)
                .collect(Collectors.toList());
        return oldUsers;
    }

    public static List<String> usersWithoutPosts() {
        List<String> noPosts = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() < 1)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return noPosts;
    }
}