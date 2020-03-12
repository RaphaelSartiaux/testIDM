
public class TimeDuration {
	private int second;
	private int minute;
	private int hour;

	public TimeDuration(int second) throws BadBadValueException {
		if(second<0) {
			throw new BadBadValueException();
		}
		else {
			whatTime(second);
			System.out.println(second);
			if (second<3600){
				do{
					minute=minute+1;
					second=second-60;
				}while (second<60);
				System.out.println(minute);
			}
		}
		
	}
	private int whatTime(int second) {
		while (second>3600) {
			hour=hour+1;
			second=second-3600;
		}
		return hour;
	}
	@Override
	public String toString() {
		if(hour>0) {
			return hour+"h "+minute+"m "+second+"s";
		}
		else if(minute>0) {
			return minute+"m "+second+"s";
		}
		else {
			return second+"s";
		}
	}
	
}
