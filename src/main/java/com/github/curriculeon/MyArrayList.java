package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{
    private SomeType[] array;

    public MyArrayList() {
        this.array = (SomeType[])new Object[0];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.array = valuesToBePopulatedWith;
    }

    @Override
    public void add(SomeType objectToAdd) {
        int newLength = this.array.length + 1;
        SomeType[] newArray = Arrays.copyOf(this.array, newLength);
        newArray[newArray.length-1] = objectToAdd;
        this.array = newArray;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        for (int curentIndex = 0; curentIndex < array.length; curentIndex++) {
            SomeType someObject = array[curentIndex];
            if (objectToRemove.equals(someObject)){
                remove(curentIndex);
            }

        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        SomeType[] rightArray = Arrays.copyOfRange(this.array, indexOfObjectToRemove+1, array.length);
        this.array = Arrays.copyOfRange(this.array, 0, indexOfObjectToRemove); // left side

        //Is there a cleaner way to do this?
        for (SomeType someType : rightArray) {
            add(someType);
        }
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.array[indexOfElement];
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {

        for (SomeType someType : array) {
            if (someType.equals(objectToCheckFor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        return array.length;
    }

    @Override
    public Iterator iterator() {
        return null;//this.array.iterator();
    }


}