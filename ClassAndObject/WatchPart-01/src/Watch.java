public class Watch{
    int hour;
    int minutes;
    int seconds;
    
    public void displayTime(){
    	 System.out.println("Hr :"+hour+" Min :"+minutes+" Sec: "+seconds);
    }
	// Setters
    public void setHour(int hr){
    	// hour instance Field
    	// hr   hr local field
    	if(hour>=1 && hour<=24)
    	hour=hr;
    	else
    	 System.out.println("Hour Valid is not valid"); 
    }
     public void setMinutes(int min){
    	minutes=min;
    }
     public void setSeconds(int sec){
    	seconds=sec;
    }

    // Getters
    public int gethours(){ return hour;}
    public int getMinutes(){ return minutes;}
    public int getSeconds(){ return seconds;}
}