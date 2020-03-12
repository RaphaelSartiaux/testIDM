
public class TimeDuration {
	private int second;
	private int minute;
	private int hour;

	public TimeDuration(int i) throws BadBadValueException {
		this.second=i;
		if(this.second<0) {
			throw new BadBadValueException();
		}
		else {
			whatTime(this.second);
			
			if (this.second<3600){
				do{
					minute=minute+1;
					this.second=this.second-60;
				}while (this.second>60);
			}
		}
		
		
	}
	private int whatTime(int second) {
		while (second>=3600) {
			hour=hour+1;
			second=second-3600;
		}
		this.second=second;
		return hour;
	}
	@Override
	public String toString() {
		if(hour>0) {
			return hour+"h "+minute+"m "+this.second+"s";
		}
		else if(minute>0) {
			return minute+"m "+this.second+"s";
		}
		else {
			return this.second+"s";
		}
	}
	
}
