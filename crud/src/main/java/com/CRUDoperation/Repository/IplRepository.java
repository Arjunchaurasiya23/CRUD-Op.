package com.CRUDoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUDoperation.entity.IplTeam;

public interface IplRepository extends JpaRepository<IplTeam, Integer> {

}
