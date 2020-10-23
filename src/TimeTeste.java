
public class TimeTeste {
	public static void main(String[] args) {
		Time t = new Time();
		
		t.setHora(02);
		t.setMin(10);
		t.setSeg(15);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
}
	
}
