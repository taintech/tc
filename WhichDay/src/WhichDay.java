import java.util.*;

//SRM519
public class WhichDay {
	public String getDay(String[] notOnThisDay) {
		String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        boolean b = false;
        for(String day1: week){
            b = true;
            for(String day2: notOnThisDay){
                if(day1.compareTo(day2)==0) b=false;
            }
            if(b) return day1;
        }
        return null;
	}
}
