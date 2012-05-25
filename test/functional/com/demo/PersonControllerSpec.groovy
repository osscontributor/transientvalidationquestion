package com.demo


class PersonControllerSpec extends geb.spock.GebReportingSpec {

    def 'test validation empty person'() {
        when:
        go 'person/create'
        $('input', id: 'create').click()

        then:
        title == 'Create Person'
        $('li', 'data-field-id':'firstName', text: 'Property [firstName] of class [class com.demo.Person] cannot be blank')
        $('li', 'data-field-id':'lastName', text: 'Property [lastName] of class [class com.demo.Person] cannot be blank')
        $('li', 'data-field-id':'title', text: 'Property [title] of class [class com.demo.Person] cannot be blank')
    }
}
