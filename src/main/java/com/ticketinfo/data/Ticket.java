package com.ticketinfo.data;

import java.util.Date;

public class Ticket {
	private Long id;
    public String name;
    public int severity;
    public String assignee; 
    public String owner;
    public String description;
    public String comments;
    
	public Ticket() {
		super();
	}
	
	public Ticket(Long id, String name, int severity, String assignee, String owner, String description, String comments) {
		super();
		this.id = id;
		this.name = name;
		this.severity = severity;
		this.assignee = assignee;
		this.owner = owner;
		this.description = description;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", severity=" + severity + ", assignee=" + assignee + ", owner="
				+ owner + ", description=" + description + ", comments=" + comments + "]";
	}
	
}
