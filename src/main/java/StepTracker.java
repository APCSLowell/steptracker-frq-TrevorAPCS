import java.util.ArrayList;
public class StepTracker
{
 private ArrayList<Integer> days = new ArrayList<Integer>();
 private int minSteps;
	public StepTracker(int mSteps){
		minSteps = mSteps;
	}
	public void addDailySteps(int steps){
		days.add(steps);
	}
	public int activeDays(){
		int aDays = 0;
		for(int steps : days)
			if(steps >= minSteps)
				aDays++;
		return aDays;
	}
	public double averageSteps(){
		if(days.size() == 0){
			return 0;
		}
		int sum = 0;
		for(int steps : days)
			sum += steps;
		return (double)sum/days.size();
	}
} 
