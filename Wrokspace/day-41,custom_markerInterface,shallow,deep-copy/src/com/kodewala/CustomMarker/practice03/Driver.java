package com.kodewala.CustomMarker.practice03;

public class Driver {

	public static void main(String[] args) {
		
		FraudInvestigationRecord fraudInvestigationRecord = new FraudInvestigationRecord("101", "TR73739", 13004, 70);
		
		EvidenceProtectionEngine engine = new EvidenceProtectionEngine();
		engine.protectEvidence(fraudInvestigationRecord);
	}
}
