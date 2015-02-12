package com.aliyesilkanat.stalker.extractor;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

/**
 * @author Ali Yesilkanat Class for extracting raw json arrays into json ld
 *         formats.
 */
public abstract class Extractor {
	/**
	 * Field for holding friends array.
	 */
	private JsonArray friendsArray;

	/**
	 * Field for holding friends array in json ld.
	 */
	private JsonArray friendsArrayLD;
	/**
	 * Logger instance
	 */
	private final Logger logger = Logger.getLogger(getClass());

	public Extractor(String friendsArray) {
		this.setFriendsArray(new Gson().fromJson(friendsArray, JsonArray.class));
	}

	abstract public void execute();

	public JsonArray getFriendsArray() {
		return friendsArray;
	}

	public JsonArray getFriendsArrayLD() {
		return friendsArrayLD;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setFriendsArray(JsonArray friendsArray) {
		this.friendsArray = friendsArray;
	}

	public void setFriendsArrayLD(JsonArray friendsArrayLD) {
		this.friendsArrayLD = friendsArrayLD;
	}
}
