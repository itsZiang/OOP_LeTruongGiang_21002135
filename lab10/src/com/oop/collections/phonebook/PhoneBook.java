package com.oop.collections.phonebook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastName(String lastname);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
