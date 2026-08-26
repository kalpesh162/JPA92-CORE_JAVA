public class Watch{
    // Why ?
    private int hour;
    private int minutes;
    private int seconds;

    public Watch(){
     hour=minutes=seconds=10;       
    }

    // What is this 
    // differntiate instance filed and local field
    public Watch(int hour,int minutes, int seconds){
//memeber of Obj    // local field to the mathod Watch
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
    }

   public Watch(int hour,int minutes){
         this.hour=hour;
         this.minutes=minutes;
    }
    
    public void displayTime(){
    	 //System.out.println("Hr :"+hour+" Min :"+minutes+" Sec: "+seconds);
         System.out.println("Hr :"+this.hour+" Min :"+this.minutes+" Sec: "+this.seconds);
    }
	// Setters
    public void setHours(int hour){
    	// hour instance Field
    	// hr   hr local field
    	if(hour>=1 && hour<=24)
    	this.hour=hour;
    	else
    	 System.out.println("Hour Valid is not valid"); 
    }
     public void setMinutes(int minutes){
    	this.minutes=minutes;
    }
     public void setSeconds(int seconds){
    	this.seconds=seconds;
    }

    // Getters
    public int getHours(){ return hour;}
    public int getMinutes(){ return minutes;}
    public int getSeconds(){ return seconds;}
}


