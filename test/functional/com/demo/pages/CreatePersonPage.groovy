package com.demo.pages

class CreatePersonPage extends geb.Page {
    static url = 'person/create'

    static content = {
        createPersonForm { $('form') }
        createPersonButton { $('input', id: 'create') }
    }

    static at = {
        title == 'Create Person'
    }
}
