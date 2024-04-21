import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, activeDays, totalSteps, totalDays;
	public StepTracker(int mSteps){
		minSteps = mSteps;
	}
	public void addDailySteps(int steps){
		totalSteps += steps;
		totalDays++;
		if(steps >= minSteps){
			activeDays++;
		}
	}
	public int activeDays(){
		return activeDays;
	}
	public int averageSteps(){
		if(totalDays == 0){
      			return 0;
    		}
		return totalSteps / totalDays;
	}
} 
