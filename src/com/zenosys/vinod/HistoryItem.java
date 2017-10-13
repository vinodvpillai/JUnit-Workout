package com.zenosys.vinod;

public class HistoryItem {

	private final int id;
	private final int amount;
	private final int total;
	private final String operation;
	
	public HistoryItem(final int id, final int amount, final int total, final String operation) {
		super();
		this.id = id;
		this.amount = amount;
		this.total = total;
		this.operation = operation;
	}
	public int getId() {
		return id;
	}
	public int getAmount() {
		return amount;
	}
	public int getTotal() {
		return total;
	}
	public String getOperation() {
		return operation;
	}	
}
