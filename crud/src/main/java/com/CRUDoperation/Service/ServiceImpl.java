package com.CRUDoperation.Service;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.CRUDoperation.Repository.IplRepository;
import com.CRUDoperation.entity.IplTeam;

@Service
public class ServiceImpl implements IplService {

	IplRepository iplRepository;

	public ServiceImpl(IplRepository iplRepository) {
		super();
		this.iplRepository = iplRepository;
	}

	@Override
	public IplTeam insertdata(IplTeam iplTeam) {
		return iplRepository.save(iplTeam);
	}

	@Override
	public List<IplTeam> getAllTeams() {

		return iplRepository.findAll();
	}

	@Override
	public IplTeam updateTeam(int id, IplTeam iplTeam) {
		
		IplTeam existingTeam= iplRepository.findById(id).get();
		existingTeam.setName(iplTeam.getName());
		existingTeam.setTropies(iplTeam.getTropies());
		existingTeam.setCaptainName(iplTeam.getCaptainName());
		
		IplTeam updatedteam= iplRepository.save(existingTeam);
		
		
		return updatedteam;
	}

	@Override
	public void delete(int id) {
		
		IplTeam existingTeam= iplRepository.findById(id).get();
		iplRepository.delete(existingTeam);
		
		
	}

}
