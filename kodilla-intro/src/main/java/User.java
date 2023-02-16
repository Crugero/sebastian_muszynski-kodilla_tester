public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { //Z podpowiedzi Kodilli - Po co getter?
        return age;
    }

    public String getName() { //Z podpowiedzi Kodilli - Po co getter?
        return name;
    }

    public static void main(String[] args) {

        User tomasz = new User("Tomasz", 20);
        User roman = new User("Roman", 25);
        User ryszard = new User("Ryszard", 21);
        User zbigniew = new User("Zbigniew", 19);
        User bartosz = new User("Bartosz", 19);

        User[] users = {tomasz, roman, ryszard, zbigniew, bartosz};
        belowAverage(users);
    }

    private static int sumAge (User[] users) {   //Suma wieku
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
                sum += users[i].age;
        }
        return sum;
    }

    private static double averageAge (User[] users) {    //Średnia wieku
        double average = (double) sumAge(users) / users.length;
        System.out.println("Średnia wieku: " + average);
        return average;
    }

    public static String belowAverage(User[] users) {
        String result = "Użytkownicy poniżej średniej wieku: ";
        double average = averageAge(users);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                result += users[i].name + ", ";
            }
        }
        System.out.println(result);
        return result;
    }
}