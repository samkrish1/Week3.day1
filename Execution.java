package Week3.Day1;

public class Execution {

	public static void main(String[] args) {
		AndroidPhone Aobj = new AndroidPhone();
		Aobj.makeCall();
		Aobj.saveContact();
		Aobj.sendMsg();
		Aobj.connectWhatsApp();
		Aobj.takeVideo();
		System.out.println("--------------Single level inheritance---------");
		SmartPhone Pobj = new SmartPhone();
		Pobj.takeVideo();
		Pobj.connectWhatsApp();
		Pobj.takeVideo();
		System.out.println("----------------Multiple level inheritance------------");
		
	}

}
