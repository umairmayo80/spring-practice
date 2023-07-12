package com.umair.spring;

public class ChildBean extends ParentBean {
    private int count;

    public ChildBean() {
    }

    public ChildBean(String message) {
        super(message);
    }

    public ChildBean(String message, int count) {
        super(message);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "count=" + count +
                "parent=" +super.toString() +
                '}';
    }
}
