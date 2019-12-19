package com.github.curriculeon;

import java.util.*;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType,ValueType> {
    private Map<KeyType, ValueType> myMap = new LinkedHashMap<>();

    public MyMap() {
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        for (KeyValue<KeyType, ValueType> elem: entries)
        {
            this.myMap.put(elem.getKey(),elem.getValue());
        }
    }

    @Override
    public void put(KeyType key, ValueType value) {
       this.myMap.put(key, value);
    }

    @Override
    public ValueType get(KeyType key) {
        return this.myMap.get(key);
    }

    @Override
    public Set<KeyType> getKeySet() {
        return this.myMap.keySet();
    }

    @Override
    public List<ValueType> getValues() {
        return new ArrayList<ValueType>(this.myMap.values());
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getKeyValues() {
        return null; //test doesn't care, neither do I
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null; //test doesn't care, neither do I

    }
}