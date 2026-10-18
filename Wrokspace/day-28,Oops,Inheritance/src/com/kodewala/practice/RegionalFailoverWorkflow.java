package com.kodewala.practice;

class InfrastructureRecoveryBase {
	
	private String serviceId;

	public InfrastructureRecoveryBase(String serviceId) {
		super();
		this.serviceId = serviceId;
	}
	
	public boolean validateRecovery() {
		return serviceId != null && !serviceId.trim().isEmpty();
	}
	
	public void recover() {
		System.out.println("Basic recovery completed");
	}
}

class DatabaseRecoveryWorkflow extends InfrastructureRecoveryBase {
	
	public DatabaseRecoveryWorkflow(String serviceId) {
        super(serviceId);
    }
	
	@Override
	public void recover() {
		super.recover();
		System.out.println("Database recovery completed");
	}
	
}

public class RegionalFailoverWorkflow extends DatabaseRecoveryWorkflow{
	
	
	public RegionalFailoverWorkflow(String serviceId) {
        super(serviceId);
    }
	
	@Override
	public void recover() {
		super.recover();
		System.out.println("Traffic switched to backup region");
	}
	
}
