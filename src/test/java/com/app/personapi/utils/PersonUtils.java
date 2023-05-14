package com.app.personapi.utils;

import com.app.personapi.dto.request.PersonDTO;
import com.app.personapi.entities.Person;

import java.time.LocalDate;
import java.util.List;

public class PersonUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
    	PersonDTO person = new PersonDTO();
    	person.setId(PERSON_ID);
        person.setFirstName(FIRST_NAME);
        person.setLastName(LAST_NAME);
        person.setCpf(CPF_NUMBER);
        person.setBirthDate("04-04-2010");
        person.setPhones(List.of(PhoneUtils.createFakeDTO()));
        return person;
    }

    public static Person createFakeEntity() {
    	Person person = new Person();
        person.setId(PERSON_ID);
        person.setFirstName(FIRST_NAME);
        person.setLastName(LAST_NAME);
        person.setCpf(CPF_NUMBER);
        person.setBirthDate(BIRTH_DATE);
        person.setPhones(List.of(PhoneUtils.createFakeEntity()));
        return person;
    }




}
