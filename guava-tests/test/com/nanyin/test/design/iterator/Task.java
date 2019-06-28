package com.nanyin.test.design.iterator;

public interface Task {
    void add(int mark);
    void removeLast();
    Iterator<Object> iterator();
}
