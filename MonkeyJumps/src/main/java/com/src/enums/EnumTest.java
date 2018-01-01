package com.src.enums;

public class EnumTest {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	private Day day;

	public EnumTest(Day day) {
		super();
		this.day = day;
	}

	public void sayDay(Day day) {
		switch (day)

		{
		case MONDAY:
			System.out.println("Its Monday");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Its weekend");
			break;
		}
	}

}
