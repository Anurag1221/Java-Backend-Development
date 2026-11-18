package com.kodewala.shallo_deep_copy.practice03;

public class CloudBackupProfile implements Cloneable {

	String profileId;
	StorageConfiguration configuration;

	CloudBackupProfile(String profileId, StorageConfiguration configuration) {
		super();
		this.profileId = profileId;
		this.configuration = configuration;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
