package sonc.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import sonc.client.ManagerService;
import sonc.shared.Movie;
import sonc.shared.SoncException;

public class ManagerServiceImpl extends RemoteServiceServlet implements ManagerService {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean register(String userId, String password) throws SoncException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePassword(String nick, String oldPassword, String newPassword) throws SoncException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authenticate(String nick, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCurrentCode(String nick, String password) throws SoncException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildShip(String nick, String password, String code) throws SoncException {
		// TODO Auto-generated method stub

	}

	@Override
	public Movie battle(List<String> nicks) {
		// TODO Auto-generated method stub
		return null;
	}

}