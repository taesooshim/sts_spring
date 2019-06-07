package org.sts.book.chap03;

public class DuplicateMemberException extends RuntimeException {

	public DuplicateMemberException() {
	}

	public DuplicateMemberException(String message) {
		super(message);
	}

	public DuplicateMemberException(Throwable cause) {
		super(cause);
	}

	public DuplicateMemberException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateMemberException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}