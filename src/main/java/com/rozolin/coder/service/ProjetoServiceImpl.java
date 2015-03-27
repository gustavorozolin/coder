package com.rozolin.coder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rozolin.coder.entity.ProjetoEntity;
import com.rozolin.coder.entity.dto.ProjetoDTO;
import com.rozolin.coder.repository.ProjetoRepository;

@Service
@Transactional
public class ProjetoServiceImpl implements ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;

	@Override
	public ProjetoDTO create(ProjetoDTO dto) {
		ProjetoEntity entity = convertToEntity(dto);
		entity = this.projetoRepository.save(entity);
		return entity.getDTO();
	}

	@Override
	public ProjetoDTO delete(Long id) {
		ProjetoEntity entity = this.projetoRepository.findOne(id);
		this.projetoRepository.delete(entity);
		return entity.getDTO();
	}

	@Override
	public List<ProjetoDTO> findAll() {
		List<ProjetoEntity> findAll = this.projetoRepository.findAll();
		List<ProjetoDTO> dtos = new ArrayList<ProjetoDTO>();
		for (ProjetoEntity projetoEntity : findAll) {
			dtos.add(projetoEntity.getDTO());
		}
		return dtos;
	}

	@Override
	public ProjetoDTO findById(Long id) {
		ProjetoEntity entity = this.projetoRepository.findOne(id);
		return entity.getDTO();
	}

	@Override
	public ProjetoDTO update(ProjetoDTO dto) {
		ProjetoEntity entity = convertToEntity(dto);
		entity = this.projetoRepository.save(entity);
		return entity.getDTO();
	}

	private ProjetoEntity convertToEntity(ProjetoDTO dto) {
		ProjetoEntity entity = null;
		if (dto.getId() == null) {
			entity = new ProjetoEntity();
		} else {
			entity = this.projetoRepository.findOne(dto.getId());
		}
		entity.setNome(dto.getNome());
		entity.setVersao(dto.getVersao());
		entity.setDtCadastro(dto.getDtCadastro());

		return entity;
	}
}