public class Watch{
    // Why ?
    private int hour;
    private int minutes;
    private int seconds;

    public Watch(){
     hour=minutes=seconds=10;       
    }
    public Watch(int h,int m int s){
        hour=h;
        minutes=m;
        seconds=s;
    }

   public Watch(int h,int m){
         hour=h;
         minutes=m;
    }
    
    public void displayTime(){
    	 System.out.println("Hr :"+hour+" Min :"+minutes+" Sec: "+seconds);
    }
	// Setters
    public void setHours(int hr){
    	// hour instance Field
    	// hr   hr local field
    	if(hr>=1 && hr<=24)
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
    public int getHours(){ return hour;}
    public int getMinutes(){ return minutes;}
    public int getSeconds(){ return seconds;}
}


