package oop;

public class ComplaintMessage extends Messages {
	private ComplaintLevels complaintLevel;

		public ComplaintLevels getComplaintLevel() {
			return complaintLevel;
		}
		public void setComplaintLevel(ComplaintLevels complaintLevel) {
			this.complaintLevel = complaintLevel;
	}
		public String toString() {
			return super.toString() + "\nComplaint level: " + complaintLevel;
		}
	}


