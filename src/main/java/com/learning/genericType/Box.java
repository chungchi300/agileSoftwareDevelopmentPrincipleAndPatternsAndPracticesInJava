package com.learning.genericType;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Box<T> {
    private T genericTypeSpecificObject;

    public T getGenericTypeSpecificObject() {
        return genericTypeSpecificObject;
    }

    public void setGenericTypeSpecificObject(T genericTypeSpecificObject) {
        this.genericTypeSpecificObject = genericTypeSpecificObject;
    }
}
