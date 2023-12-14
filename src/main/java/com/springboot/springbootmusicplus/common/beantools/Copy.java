package com.springboot.springbootmusicplus.common.beantools;


public interface Copy {

    void copy(Object source, Object target, String ignoreProperties);

    void merge(Object source, Object target, String ignoreProperties);
}
