package example1;

import java.io.Serializable;

public class Mark implements Serializable{
	private double mark;
//	private double att1;
//	private double att2;
//	private double finalScore;
	
	public Mark() {}
	
	public Mark(double mark) {
		this.mark=mark;
	}
	public double getValue() {
		return mark;
	}
	public String toString() {
		return "MARK: "+mark;	
	}
	

//
//	public double getAtt1() {
//		return att1;
//	}
//
//	public void setAtt1(double att1) {
//		this.att1 = att1;
//	}
//
//	public double getAtt2() {
//		return att2;
//	}
//
//	public void setAtt2(double att2) {
//		this.att2 = att2;
//	}
//
//	public double getFinalScore() {
//		return finalScore;
//	}
//
//	public void setFinalScore(double finalScore) {
//		this.finalScore = finalScore;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(att1, att2, finalScore);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Mark other = (Mark) obj;
//		return Double.doubleToLongBits(att1) == Double.doubleToLongBits(other.att1)
//				&& Double.doubleToLongBits(att2) == Double.doubleToLongBits(other.att2)
//				&& Double.doubleToLongBits(finalScore) == Double.doubleToLongBits(other.finalScore);
//	}
//
//	@Override
//	public String toString() {
//		return "Mark [att1=" + att1 + ", att2=" + att2 + ", finalScore=" + finalScore + "]";
//	}

	
}
