package com.harbour.softwareengineering.springboot.dictionaries;

public interface IDictionary {

    String get(String word);

    default String name() {
        return this.getClass().getSimpleName();
    }

}
