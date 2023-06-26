package ch08_Interface.sec02_Multiple;
import ch08_Interface.sec01.RemoteControllerable;
public class Main {

	public static void main(String[] args) {
		RemoteControllerable rc = new SmartTv();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
		Searchable sc = new SmartTv();
		sc.search("YouTube");
		
		SmartTv stv = new SmartTv();
		stv.turnOn();
		stv.search("Naver");
		stv.setVolume(7);
		stv.turnOff();
	}

}
