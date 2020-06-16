import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(msg + year + "/" + month + "/" + day + "/");
		
		switch(dayOfWeek) {
			case Calendar.SUNDAY : System.out.println("�Ͽ���"); break;
			case Calendar.MONDAY : System.out.println("������"); break;
			case Calendar.TUESDAY : System.out.println("ȭ����"); break;
			case Calendar.WEDNESDAY : System.out.println("������"); break;
			case Calendar.THURSDAY : System.out.println("�����"); break;
			case Calendar.FRIDAY : System.out.println("�ݿ���"); break;
			case Calendar.SATURDAY : System.out.println("�����"); break;
		}
		
		System.out.print("(" + hourOfDay + "��)");
		if(ampm == Calendar.AM) {
			System.out.print("����");
		}
		else {
			System.out.print("����");
		}
		
		System.out.println(hour + "�� " + minute + "�� " + second + "�� " + millisecond + "�и���");
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("���� ", now);
		
		Calendar myBirthday = Calendar.getInstance();
		myBirthday.clear();
		myBirthday.set(2002, 9, 11);
		myBirthday.set(Calendar.HOUR_OF_DAY, 20);
		myBirthday.set(Calendar.MINUTE, 30);
		printCalendar("10�� ���� �� ��μ��� ������ ", myBirthday);

	}

}
