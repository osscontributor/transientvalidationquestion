package com.demo

import com.demo.pages.*

class PersonControllerSpec extends geb.spock.GebReportingSpec {

    def 'test validation empty person'() {
        when:
        to CreatePersonPage

        then:
        at CreatePersonPage
        createPersonButton.click()

        then:
        at CreatePersonPage
        title == 'Create Person'
        $('li', 'data-field-id':'firstName', text: 'Property [firstName] of class [class com.demo.Person] cannot be blank')
        $('li', 'data-field-id':'lastName', text: 'Property [lastName] of class [class com.demo.Person] cannot be blank')
        $('li', 'data-field-id':'title', text: 'Property [title] of class [class com.demo.Person] cannot be blank')
    }

    def 'test validating a valid person'() {
        when:
        to CreatePersonPage

        then:
        at CreatePersonPage

        when:
        firstNameField.value('Jeff')
        lastNameField.value('Brown')
        titleField.value('Engineer')
        createPersonButton.click()

        then:
        at ShowPersonPage
    }
}
