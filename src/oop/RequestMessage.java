package oop;


public class RequestMessage extends Messages {
		private boolean approved;
		
		public RequestMessage() {
			
		}
		
		public boolean isApproved() {
			return approved;
		}
		public void setApproved(boolean approved) {
			this.approved = approved;
		}
		public String toString() {
			return super.toString() + "\nСтатус запроса: " + (approved ? "Одобрен" : "Отклонен");
		}
	}

