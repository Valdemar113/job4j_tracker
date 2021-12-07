package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы :
 * содержит всех пользователей с привязанными к ним счетами, добавление
 * пользователя и счета, поиск по паспорту и реквизитам,
 * перевод денег с одного счета на другой
 * @author Drozhzhin Vladimir
 * @version 1.0
 */

public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     * @param user пользователь, объект класса User
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     * @param passport паспорт пользователя, поле класса User
     * @param account объект класса Account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accList = users.get(user);
            if (!accList.contains(account)) {
                accList.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту
     * @param passport паспорт пользователя, поле класса User
     * @return возвращает пользователя с заданным паспортом или
     * null , если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод осуществляет поиск счета пользователя по реквизитам
     * @param passport паспорт пользователя, поле класса User
     * @param requisite реквизиты, поле класса Account
     * @return возвращает счет пользователя с заданными реквизитами
     * или null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User userFBP = findByPassport(passport);
        if (userFBP != null) {
            List<Account> list = users.get(userFBP);
            for (Account i : list) {
                if (i.getRequisite().equals(requisite)) {
                    return i;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перечисление денег с одного счёта на другой счёт
     * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма денег
     * @return возвращает true, если перевод возможен или false,
     * если условия перевода не соблюдены
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && srcAcc.getBalance() >= amount && destAcc != null) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            return true;
        }
        return false;
    }
}
