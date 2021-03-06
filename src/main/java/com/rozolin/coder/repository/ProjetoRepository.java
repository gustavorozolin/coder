package com.rozolin.coder.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.rozolin.coder.entity.ProjetoEntity;

public interface ProjetoRepository extends Repository<ProjetoEntity, Long> {
	
	void delete(ProjetoEntity entity);
	 
    List<ProjetoEntity> findAll();
 
    ProjetoEntity findOne(Long id);
 
    ProjetoEntity save(ProjetoEntity entity);
}