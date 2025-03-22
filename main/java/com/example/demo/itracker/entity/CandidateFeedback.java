package com.example.demo.itracker.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CandidateFeedback {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long feedBackId;
	private Long candidateId;
	private int score;
	private String comments;
	private String status;
	private String round;
	
	
	
	public CandidateFeedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateFeedback(Long feedBackId, Long candidateId, int score, String comments, String status,
			String round) {
		super();
		this.feedBackId = feedBackId;
		this.candidateId = candidateId;
		this.score = score;
		this.comments = comments;
		this.status = status;
		this.round = round;
	}
	public Long getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(Long feedBackId) {
		this.feedBackId = feedBackId;
	}
	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	@Override
	public String toString() {
		return "CandidateFeedback [feedBackId=" + feedBackId + ", candidateId=" + candidateId + ", score=" + score
				+ ", comments=" + comments + ", status=" + status + ", round=" + round + "]";
	}
	
}
