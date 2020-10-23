
public class Time {

	private int hora;
	private int min;
	private int seg;

	public String exibirHoraUniversal() {
		return hora + ":" + min + ":" + seg;
	}

	public String exibirHoraPadrao() {
		String strHora;
		if (hora == 0) {
			strHora = 12 + ":" + min + ":" + seg + "AM";
		} else if (hora == 12) {
			strHora = 12 + ":" + min + ":" + seg + "PM";
		} else if (hora >= 1 && hora <= 11) {
			strHora = hora + ":" + min + ":" + seg + "AM";

		} else {
			strHora = (hora - 12) + ":" + min + ":" + seg + "PM";

		}
		return strHora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}
}
