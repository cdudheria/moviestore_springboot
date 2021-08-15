package com.netchills.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tvShow_list")
public class TvShows {
	@Id
	private String id;
	private String name;
	private String image_path;
	private String cover_path;
	private String description;
	private int isFeatured;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getimage_path() {
		return image_path;
	}
	public void setimage_path(String image_path) {
		this.image_path = image_path;
	}
	public String getcover_path() {
		return cover_path;
	}
	public void setcover_path(String cover_path) {
		this.cover_path = cover_path;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsFeatured() {
		return isFeatured;
	}
	public void setIsFeatured(int isFeatured) {
		this.isFeatured = isFeatured;
	}
	
	@Override
	public String toString() {
		return "TvShows [id=" + id + ", name=" + name + ", image_path=" + image_path + ", cover_path=" + cover_path
				+ ", description=" + description + ", isFeatured=" + isFeatured + "]";
	}
	


}
