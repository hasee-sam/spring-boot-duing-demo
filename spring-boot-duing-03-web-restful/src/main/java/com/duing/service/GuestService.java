package com.duing.service;

import com.duing.bean.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();
    void add(Guest guest);

    Guest get(String name);

    void update(Guest guest);

    void delete(String name);
}
