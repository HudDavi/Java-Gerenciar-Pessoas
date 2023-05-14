package com.app.personapi.utils;

import com.app.personapi.dto.request.PhoneDTO;
import com.app.personapi.entities.Phone;
import com.app.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
    	PhoneDTO phone = new PhoneDTO();
    	phone.setId(PHONE_ID);
    	phone.setNumber(PHONE_NUMBER);
    	phone.setType(PHONE_TYPE);
    	return phone;
    }

    public static Phone createFakeEntity() {
    	Phone phone = new Phone();
    	phone.setId(PHONE_ID);
    	phone.setNumber(PHONE_NUMBER);
    	phone.setType(PHONE_TYPE);
    	return phone;
    }
}
