package com.CRUDoperation.Service;

import com.CRUDoperation.entity.IplTeam;
import java.util.List;

public interface IplService {

	public IplTeam insertdata(IplTeam iplTeam);

	public List<IplTeam> getAllTeams();

	public IplTeam updateTeam(int id, IplTeam iplTeam);
	
	public void delete(int id);

}
