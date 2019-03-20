package com.ishaat.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends Tweet implements Serializable {

	private static final long serialVersionUID = 1L;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isBodyValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

}