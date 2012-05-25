package com.demo.pages

class CreatePersonPage extends geb.Page {
    static url = 'person/create'

    static content = {
        firstNameField { $('input', id: 'firstName') }
        lastNameField { $('input', id: 'lastName') }
        titleField { $('input', id: 'title') }
        createPersonButton { $('input', id: 'create') }
    }

    static at = {
        title == 'Create Person'
    }
}
