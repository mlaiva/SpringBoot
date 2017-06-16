package com.example;

public class Review {
		private String userName;
		private int rating;
		private boolean approved;
		
		protected Review(){
			
		}
		public Review (String userName, int rating, boolean approved){
			this.userName = userName;
			this.rating=rating;
			this.approved=approved;
			}
			public String getUserName(){
				return userName;
			}
			public int getRaring(){return rating;}
			public boolean isapproved(){return approved;}
}
