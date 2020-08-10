package com.cpf.patterns.current;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * date 2020/7/14
 *
 * @author caopengflying
 */
public class LockTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        ConcurrentHashMap<String, String> stringStringConcurrentHashMap = new ConcurrentHashMap<>();
        Lock lock = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.writeLock();
        try {
            lock.lock();
            lock.tryLock();

        } finally {
            lock.unlock();
        }
    }
}
