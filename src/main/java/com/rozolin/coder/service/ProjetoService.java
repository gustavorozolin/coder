package com.rozolin.coder.service;

import java.util.List;

import com.rozolin.coder.entity.dto.ProjetoDTO;

public interface ProjetoService {
 
    ProjetoDTO create(ProjetoDTO todo);
 
    ProjetoDTO delete(Long id);
 
    List<ProjetoDTO> findAll();
 
    ProjetoDTO findById(Long id);
 
    ProjetoDTO update(ProjetoDTO todo);
}