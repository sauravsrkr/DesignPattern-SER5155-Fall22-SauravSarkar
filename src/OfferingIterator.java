public class OfferingIterator implements ListIterator {

	private OfferingList offeringList;
	private int index;

	public OfferingIterator(OfferingList offerings) {
		this.offeringList = offerings;
		this.index = 0;
	}

	public boolean hasNext() {
		return this.index < offeringList.size();
	}

	public Offering next() {
		Offering offering = null;
		if (this.hasNext()) {
			offering = offeringList.get(index);
		}
		index += 1;
		return offering;
	}

	public void remove() {
		offeringList.remove(index);
		index--;
	}

	public void moveToHead() {
		this.index = 0;
	}

}
