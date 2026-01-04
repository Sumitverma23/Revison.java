package org.example.Generics;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU <K,V> {
    private int capacity;
    private LinkedHashMap<K, V> cache;

    public LRU(int capacity) {
        this.capacity = capacity;

        cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRU.this.capacity;
            }
        };
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void display() {
        System.out.println(cache);
    }

}


