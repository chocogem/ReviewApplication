package com.demo.review.entities;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class ReviewTransaction {
	@Id
	private Integer reviewID;
	
	@CreationTimestamp
	@Column(insertable = true,updatable=false)
	private Date createdDatetime;
	
	@UpdateTimestamp
	@Column(insertable = false,updatable=true)
	private Date modifiedDatetime;
	@OneToMany(mappedBy="reviewID", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
	List<Review>reviews;
	
	public int getReviewID() {
		return reviewID;
	}
	public void setReviewID(Integer reviewID) {
		this.reviewID = reviewID;
	}
	

	public Date getCreatedDatetime() {
		return createdDatetime;
	}
	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}
	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	


}