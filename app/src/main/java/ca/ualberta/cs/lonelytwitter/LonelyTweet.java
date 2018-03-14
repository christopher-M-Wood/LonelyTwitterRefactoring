package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public abstract class LonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;
	protected Date tweetDate;
	protected String tweetBody;

	public LonelyTweet() {
	}

	public LonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public Date getTweetDate() {
		return tweetDate;
	}

	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}

	public abstract boolean isValid();

	public abstract String getTweetBody();
}