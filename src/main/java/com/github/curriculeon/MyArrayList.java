package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{
    private List<SomeType> myArrayList = new ArrayList<>();

    public MyArrayList() {
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.myArrayList.addAll(Arrays.asList(valuesToBePopulatedWith));
    }

    @Override
    public void add(SomeType objectToAdd) {
        this.myArrayList.add(objectToAdd);
    }

    @Override
    public void remove(SomeType objectToRemove) {
        this.myArrayList.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        this.myArrayList.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.myArrayList.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return this.myArrayList.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return this.myArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return this.myArrayList.iterator();
    }
}