package com.umair.spring;

public class ParentBean {
    private String message;

    public ParentBean() {
    }

    public ParentBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ParentBean{" +
                "message='" + message + '\'' +
                '}';
    }

    // Getters and setters
}

