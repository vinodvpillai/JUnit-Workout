package com.zenosys.vinod;

import java.util.ArrayList;
import java.util.List;

public class TrackingService {

	private int total;
	private int goal;
	//private int historyId=0;
	private List<HistoryItem> history=new ArrayList<HistoryItem>();
	private int historyid=0;
	
	public void addProtein(final int amount){
		total+=amount;
		history.add(new HistoryItem(++historyid, amount, total, "Added Protein"));
	}
			
	public void removeProtein(final int amount){
		total-=amount;
		if(total<0)
			total=0;
		history.add(new HistoryItem(++historyid, amount, total, "Removed Protein"));
	}
	
	public int getTotal(){
		return total;
	}
	
	public void setGoal(final int goal){
		if(goal<=0){
			throw new InvalidGoalException("Goal less than 0");
		}
		this.goal=goal;
	}
	
	public boolean isGoalMet(){
		return total>=goal;
	}
	
	public List<HistoryItem> getHistory(){
		return history;
	}
}
