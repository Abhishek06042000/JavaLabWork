class ValidEnrollment{
	public static void main(String args[]) {
		String enrollment = args[0];
			int AdmissionYear = Integer.parseInt(enrollment.substring(0,2));
			int collegeCode = Integer.parseInt(enrollment.substring(2,5));
			int streamCode = Integer.parseInt(enrollment.substring(5,7));
			int branchCode = Integer.parseInt(enrollment.substring(7,9));
			int enrollNumber = Integer.parseInt(enrollment.substring(9,12));

		String errorMessage ="";
			
			if(AdmissionYear < 16 || AdmissionYear > 18)
				errorMessage+="college admission year should be 16, 17 or 18\n";
			
		 	if(collegeCode != 47)
				errorMessage+="Invalid College Code!!!\n";
			
		 	if(streamCode != 1 && streamCode != 31)
				errorMessage+="Invalid Stream Code!!!\n";
			
		 	if(branchCode != 7)
				errorMessage+="Invalid Branch Code!!!\n";
			
		 	if(enrollNumber < 0 || enrollNumber > 70)
				errorMessage+="Invalid enrollment Number!!!\n";

		if(errorMessage.length()>0)
				System.out.println(errorMessage);
		else
				System.out.println("valid");
	}
}