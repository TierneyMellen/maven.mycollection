package com.github.curriculeon;

public class    KeyValue<KeyType, ValueType> {
    private KeyType myKey;
    private ValueType myValue;
    public KeyValue(KeyType key, ValueType value) {
        myKey = key;
        myValue = value;
    }

    public KeyType getKey() {
        return myKey;
    }

    public ValueType getValue() {
        return myValue;
    }

    public void setKey(KeyType key) {
        myKey = key;
    }

    public void setValue(ValueType value) {
        myValue = value;
    }
}
