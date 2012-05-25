package com.demo



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testValidation() {
	def p = new Person()
        p.validate()
        assert p.errors.getFieldError('firstName') != null
        assert p.errors.getFieldError('lastName') != null
        assert p.errors.getFieldError('title') != null
    }
}
