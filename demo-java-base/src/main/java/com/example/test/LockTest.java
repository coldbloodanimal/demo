package com.example.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Monster
 * @date: 2019-09-20 15:58
 **/
public class LockTest { private Lock lock = new ReentrantLock(); private Condition condition = lock.newCondition(); public void before() { lock.lock(); try { System.out.println("before"); condition.signalAll(); } finally { lock.unlock(); } } public void after() { lock.lock(); try { condition.await(); System.out.println("after"); } catch (InterruptedException e) { e.printStackTrace(); } finally { lock.unlock(); } } }
