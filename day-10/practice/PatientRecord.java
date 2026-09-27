class PatientRecord {
	
	//Patient file connected with PatientRecord
	int patientId;
	String patientName;
	int roomNumber;
	
	//default accessi modifire
	void printRecord(){
		
		System.out.println("Patient Id" + patientId);
		System.out.println("Patient Name" + patientName);
		System.out.println("Room Number" + roomNumber);
		
	}
}



