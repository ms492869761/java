package com.fan.example3;

public class Clock {

	// 属性
	private TimeNumber sec = new TimeNumber(60);
	private TimeNumber min = new TimeNumber(60);
	private TimeNumber hour = new TimeNumber(24);
	private DayTimeNumber day = new DayTimeNumber();
	private TimeNumber month = new TimeNumber(12);
	private TimeNumber year = new TimeNumber(9999);

	public void run() {
		System.out.println("tick");
		boolean a = sec.tick();
		if (a) {
			boolean b = min.tick();
			if (b) {
				boolean c = hour.tick();
				if (c) {
					int dayThreshold=0;
					if (month.getValue() == 1||month.getValue() == 3||month.getValue() == 5||month.getValue() == 7||month.getValue() == 8||month.getValue() == 10||month.getValue() == 12) {
						dayThreshold=31;
					}else if(year.getValue()%4==0&&month.getValue()==2){
						dayThreshold=29;
					}else if(year.getValue()%4!=0&&month.getValue()==2){
						dayThreshold=28;
					}else {
						dayThreshold=30;
					}
					boolean d = day.tick(dayThreshold);
					if (d) {
						boolean e = month.tick();
						if (e) {
							year.tick();
						}
					}
				}
			}
		}
		System.out.println(year.getValue() + "/" + month.getValue() + "/" + day.getValue() + "/" + hour.getValue() + "/"
				+ min.getValue() + ":" + sec.getValue());
	}

}
