package sonc.game;

import java.io.Serializable;
import java.lang.String;

import sonc.battle.Ship;
import sonc.shared.*;

public class Player extends java.lang.Object implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nick, password;
	private String code;
	
	
	Player(String nick,String password) {
		
	}
	
	String getNick() {
		return nick;
	}
	
	void setNick(String nick) {
		this.nick = nick;
	}
	
	String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	String getCode() {
		return code;
	}
	
	void setCode(String code) {
		this.code = code;
	}
	
	void checkCode() throws SoncException {
		
	}
	
	public sonc.server.src.sonc.battle.Ship instanceShip() {
		return null;
	}
	
	boolean authenticate(String password) {
		return false;
	}	
}