package com.system.variables;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DueDateTest {
	public static void main(String[] args) {
		Timestamp t1 = new Timestamp(System.currentTimeMillis());
		String dueDate = getStringDate(addDays(t1, 15));
		String dueDate30 = getStringDate(addDays(t1, 30));
		System.out.println("Due days are:" + dueDate);
		System.out.println("Due days with 30 are:" + dueDate30);
	}

	public static String getStringDate(Timestamp tsTimestamp1) {

		StringBuffer sbDate = new StringBuffer();
		String sDate = null;

		Calendar calendar = new GregorianCalendar();

		if (tsTimestamp1 != null) {

			calendar.setTime(tsTimestamp1);

			int year = (calendar.get(Calendar.YEAR));
			int month = (calendar.get(Calendar.MONTH)) + 1;
			int date = (calendar.get(Calendar.DATE));

			sbDate.append(month);
			sbDate.append("/");
			sbDate.append(date);
			sbDate.append("/");
			sbDate.append(year);
			sDate = sbDate.toString();
		}

		return sDate;

	}

	public static Timestamp addDays(Timestamp tsTimestamp1, int iNoOfDays) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(tsTimestamp1);
		calendar.add(Calendar.DATE, iNoOfDays);

		return (new Timestamp(calendar.getTimeInMillis()));
	}
}
