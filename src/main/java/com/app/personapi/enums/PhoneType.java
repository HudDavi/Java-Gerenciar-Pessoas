package com.app.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

	PhoneType(String string) {
		// TODO Auto-generated constructor stub
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		PhoneType.description = description;
	}

	private static String description;
}
