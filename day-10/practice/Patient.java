class Patient{
	
	//default accessi modifire
	public static void main(String args[]) {
		
		//object creation
		PatientRecord PaRecord = new PatientRecord();
		
		//assigning values in the variable
		PaRecord.patientId = 101;
		PaRecord.patientName = "Amit";
		PaRecord.roomNumber = 2566945;
		
		PaRecord.printRecord();
	}
}