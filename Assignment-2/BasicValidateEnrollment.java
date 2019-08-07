class Enrollment{
	public static void main(String args[]) {

			boolean valid = false;
			String enroll = args[0];
			int enrollYear = Integer.parseInt(enroll.substring(0,2)); //17
			int enrollClgcode = Integer.parseInt(enroll.substring(2,5)); //47
			int enrollReg = Integer.parseInt(enroll.substring(5,7)); //1
			int enrollBrcode = Integer.parseInt(enroll.substring(7,10)); //70
			int enrollSerial = Integer.parseInt(enroll.substring(10,12)); //3

			if(enrollYear>=16 && enrollYear<=18 && enrollClgcode==47 && enrollReg==1 || enrollReg==31 && enrollBrcode==70 && enrollSerial<=1 && enrollSerial>=65 )
			{
				valid = true;
			}
			else
			{
				valid = false;
			}
			if(valid == true)
			{
				System.out.println("Yeah!Your Number is valid and\nEnrollment is:" + args[0]);
			}
			else
			{
				System.out.println("Opps!Your Number is invalid");
			}			
	}
}

