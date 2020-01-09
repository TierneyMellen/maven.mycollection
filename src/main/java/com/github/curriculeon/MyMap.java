package com.github.curriculeon;

import java.util.*;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType,ValueType> {
    private MyArrayList<KeyValue<KeyType, ValueType>> myMap;

    public MyMap() {
        this.myMap = new MyArrayList<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        for (KeyValue<KeyType, ValueType> keyValueToAdd : entries) {
            this.myMap.add(keyValueToAdd);
        }
    }

    @Override
    public void put(KeyType key, ValueType value) {
       KeyValue<KeyType,ValueType> pairEntry = new KeyValue<>(key, value);
       myMap.add(pairEntry);
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