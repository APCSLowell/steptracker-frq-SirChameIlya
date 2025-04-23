import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minActive, goodDays, totalSteps, days;
 public StepTracker(int min){
  minActive = min;
  goodDays = 0;
  totalSteps = 0;
  days = 0;
 }
 public void addDailySteps(int steps){
  totalSteps += steps;
  days++;
  if (steps >= minActive){
   goodDays++;
  }
 }
 public int activeDays(){
  return goodDays;
 }
 public double averageSteps(){
  if (days == 0){
   return 0;
 }
  return (double)totalSteps/days;
 }
} 
