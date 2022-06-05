package model;

public class Video {
	private int videoId;
	private String address;
	private String categoryName;
	private String videoDescription;
	private String refugeeIdFK;

	public Video() {
		super();
	}

	public Video(int videoId, String address, String categoryName, String videoDescription, String refugeeIdFK) {
		super();
		this.videoId = videoId;
		this.address = address;
		this.categoryName = categoryName;
		this.videoDescription = videoDescription;
		this.refugeeIdFK = refugeeIdFK;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

	public String getRefugeeIdFK() {
		return refugeeIdFK;
	}

	public void setRefugeeIdFK(String refugeeIdFK) {
		this.refugeeIdFK = refugeeIdFK;
	}

}
