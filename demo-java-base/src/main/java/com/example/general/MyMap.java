package com.example.general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author: Monster
 * @date: 2019-08-07 16:38
 **/
public class MyMap<K,V> {
    private Set<K> keys;
    private List<V> values;
    private List<Entry<K,V>> entries=new ArrayList<>();
    private class Entry<K,V>{
        private K key;
        private V value;
    }
    public void add(K key,V value){
        Entry<K,V> entry=new Entry<>();
        entry.key=key;
        entry.value=value;
        entries.add(entry);
    }
    public V get(K key){
        for (Entry<K, V> entry : entries) {
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

}
