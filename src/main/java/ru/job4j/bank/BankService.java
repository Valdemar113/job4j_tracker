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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accList = users.get(user.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск счета пользователя по реквизитам
     * @param passport паспорт пользователя, поле класса User
     * @param requisite реквизиты, поле класса Account
     * @return возвращает счет пользователя с заданными реквизитами
     * или null, если счет не найден
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> srcAcc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc.isPresent() && srcAcc.get().getBalance() >= amount && destAcc.isPresent()) {
            srcAcc.get().setBalance(srcAcc.get().getBalance() - amount);
            destAcc.get().setBalance(destAcc.get().getBalance() + amount);
            return true;
        }
        return false;
    }
}
