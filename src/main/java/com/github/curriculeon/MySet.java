package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySet<SomeType> implements MyCollectionInterface<SomeType>{
    private MyArrayList<SomeType> mySet = new MyArrayList<>();

    public MySet() {
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        for(SomeType elem: valuesToBePopulatedWith)
        {
            if (!this.mySet.contains(elem)) {
                this.mySet.add(elem);
            }
        }
    }

    @Override
    public void add(SomeType objectToAdd) {
        if (!this.mySet.contains(objectToAdd)) {
            this.mySet.add(objectToAdd);
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        this.mySet.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        this.mySet.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.mySet.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return mySet.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return this.mySet.size();
    }

    @Override
    public Iterator iterator() {
        return this.mySet.iterator();
    }
}
