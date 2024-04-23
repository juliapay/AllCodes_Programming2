package AbstrakteKlassenInterface.musikanten;

public class Hund extends Musikant{
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
	super(aB,i);
	this.bellLautstaerke=bellLautstaerke;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	@Override
	public String toString() {
		return "Hund "+bellLautstaerke+": "+ super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		if(instrument.getLautstaerke()>bellLautstaerke) {
			return (int) Math.floor(instrument.getLautstaerke());
		}else{
			return (int) Math.floor(bellLautstaerke);
		}
	}

	@Override
	public double spieleMusik() {

		return Math.abs((bellLautstaerke-instrument.getLautstaerke())/2);
	}
}
