package com.kodewala.CustomMarker.practice03;

public class EvidenceProtectionEngine{
	
	public void protectEvidence(Object obj) {
		
		if(obj instanceof ProtectedEvidence) {
			
			FraudInvestigationRecord record = (FraudInvestigationRecord) obj;
			
			System.out.println("investigationId;" + record.investigationId);
			System.out.println("transactionReference;" + record.transactionReference);
			System.out.println("Evidence protection activated");
			System.out.println();
			
			InvestigationAuditManager audit = new InvestigationAuditManager();
			audit.recordProtectionActivity(record.investigationId);
		}
		else{
			System.out.println("Unauthorized evidence protection request");
		}
	}
}
