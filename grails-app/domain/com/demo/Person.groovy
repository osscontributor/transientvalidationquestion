package com.demo

class Person {
    String firstName
    String lastName
    transient String title

    static constraints = {
        firstName blank: false
        lastName blank: false
        title blank: false
    }
}
