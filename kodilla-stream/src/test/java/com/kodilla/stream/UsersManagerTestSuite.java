package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersManagerTestSuite {

    @Test
    void checkChemistFilter() {
        List<String> chemists = UsersManager.filterChemistGroupUsernames();
        assertEquals(2, chemists.size());
        assertTrue(chemists.contains("Walter White"));
        assertTrue(chemists.contains("Gale Boetticher"));
    }

    @Test
    void checkAgeFilter() {
        List<User> over45 = UsersManager.filterUsersByAge();
        assertEquals(3, over45.size());
        assertTrue(over45.contains(new User("Walter White", 50, 7, "Chemists")));
        assertTrue(over45.contains(new User("Gus Firing", 49, 0, "Board")));
        assertTrue(over45.contains(new User("Mike Ehrmantraut", 57, 0, "Security")));
    }

    @Test
    void filterUsersWithoutPosts() {
        List<String> withoutPosts = UsersManager.usersWithoutPosts();
        assertEquals(2, withoutPosts.size());
        assertTrue(withoutPosts.contains("Gus Firing"));
        assertTrue(withoutPosts.contains("Mike Ehrmantraut"));
    }
}