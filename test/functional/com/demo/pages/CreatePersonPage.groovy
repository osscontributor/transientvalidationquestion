package com.demo.pages

class CreatePersonPage extends geb.Page {
    static url = 'person/create'

    static content = {
        createPersonForm { $('form') }
    }

    static at = {
        title == 'Create Person'
    }
}
