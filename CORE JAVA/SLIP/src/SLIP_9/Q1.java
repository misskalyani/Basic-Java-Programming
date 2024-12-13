package SLIP_9;
//Q1) Define a “Clock” class that does the following ;
//a. Accept Hours, Minutes and Seconds
//b. Check the validity of numbers
//c. Set the time to AM/PM mode
//Use the necessary constructors and methods to do the above task
import java.util.*;
class Clock 
{
    int hours;
    int minutes;
    int seconds;
    String timeMode;
   Clock(int hours, int minutes, int seconds) 
   {
        setTime(hours, minutes, seconds);
        timeMode = "AM";
   }
   void setTime(int hours, int minutes, int seconds) 
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
   void setHours(int hours) 
    {
        if (hours >= 0 && hours <= 23) 
        {
            this.hours = hours;
        } 
        else 
        {
        	 System.out.println("Hours must be between 0 and 23");
        }
    }

    void setMinutes(int minutes) 
    {
        if (minutes >= 0 && minutes <= 59) 
        {
            this.minutes = minutes;
        } 
        else 
        {
            System.out.println("Minutes must be between 0 and 59");
        }
    }

    void setSeconds(int seconds) 
    {
        if (seconds >= 0 && seconds <= 59) 
        {
            this.seconds = seconds;
        }
        else
        {
        	 System.out.println("Seconds must be between 0 and 59");
        }
    }
    void setTimeMode(String timeMode) 
    {
        if (timeMode.equalsIgnoreCase("AM") || timeMode.equalsIgnoreCase("PM")) 
        {
            this.timeMode = timeMode.toUpperCase();
        } 
        else 
        {
        	 System.out.println("Time mode must be either AM or PM");
        }
    }

    // Getter methods
   int getHours() 
   {
        return hours;
    }

   int getMinutes() 
   {
        return minutes;
    }

   int getSeconds() 
   {
        return seconds;
    }

    String getTimeMode() 
    {
        return timeMode;
    }

    // Method to display time in AM/PM format
    void displayTime() 
    {
        int displayHours = hours % 12;
        if (displayHours == 0) 
        {
            displayHours = 12;
        }
        System.out.println(displayHours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds) + " " + timeMode);
    }
}
public class Q1 
{
	public static void main(String[] args) 
	{
		Clock clock = new Clock(14, 30, 0);
        clock.setTimeMode("PM");
        clock.displayTime();  // Output: 2:30:00 PM
	}

}
