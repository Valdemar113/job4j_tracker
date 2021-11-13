package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
                users.put(user, new ArrayList<>());
            }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accList = users.get(user);
        if (!accList.contains(account)) {
            accList.add(account);
        }

    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    public User findByRequisite(String passport, String requisite) {
        User user1 = findByPassport(passport);
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }

}
