package com.example.general;

import javax.swing.text.TabableView;
import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K,V> {
    public static void main(String[] args) {
        MyHashMap<String,Integer> map=new MyHashMap<>();
        map.put("小明",2);
        map.put("xiaohong",993);
        System.out.println(map.get("小明"));
        System.out.println(map.get("xiaohong"));
        System.out.println(map.get("zz"));
    }
    public static int TABLE_SIZE=10;
    public List<List<Entry<K,V>>> entries;

    {
        //entrie不能为不连续的值
        entries=new ArrayList<>(TABLE_SIZE);
        for(int i=0;i<TABLE_SIZE;i++){
            entries.add(i,null);
        }
    }
    private class Entry<K,V>{
        private K key;
        private V value;
    }

    private void put(K k,V v){
        int index=getIndex(k.hashCode());
        List<Entry<K,V>> list=entries.get(index);
        if(list==null){
            list=new ArrayList<>();
        }
        Entry<K,V> entry=new Entry<>();
        entry.key=k;
        entry.value=v;
        list.add(entry);
        entries.add(index,list);
    }

    private V get(K k){
        List<Entry<K,V>> list=entries.get(getIndex(k.hashCode()));
        if(list.isEmpty()){
            return null;
        }else{
            for (Entry<K, V> entry : list) {
                if(entry.key.equals(k)){
                    return entry.value;
                }
            }
        }
        return null;
    }

    static int getIndex(int hashcode){
        return hashcode%TABLE_SIZE;
    }
}
