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
		return totalSteps / totalDays;
	}
} 
