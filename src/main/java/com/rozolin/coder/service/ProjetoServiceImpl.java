package com.rozolin.coder.service;

import java.util.Collection;
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
 
    private final ProjetoRepository projetoRepository;
 
    @Autowired
    ProjetoServiceImpl(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }
 
    @Override
    public ProjetoDTO create(ProjetoDTO dto) {
        
    	persisted = repository.save(persisted);
        return convertToDTO(persisted);
    }
 
    @Override
    public ProjetoDTO delete(String id) {
        Todo deleted = findTodoById(id);
        repository.delete(deleted);
        return convertToDTO(deleted);
    }
 
    @Override
    public List<ProjetoDTO> findAll() {
          List<ProjetoEntity> findAll = this.projetoRepository.findAll();
		
       
        return convertToDTOs(todoEntries);
    }
 
    private List<ProjetoDTO> convertToDTOs(List<ProjetoEntity> models) {
        return models.stream()
                .map(this::convertToDTO)
                .collect(toList());
    }
 
    @Override
    public TodoDTO findById(String id) {
        Todo found = findTodoById(id);
        return convertToDTO(found);
    }
 
    @Override
    public TodoDTO update(TodoDTO todo) {
        Todo updated = findTodoById(todo.getId());
        updated.update(todo.getTitle(), todo.getDescription());
        updated = repository.save(updated);
        return convertToDTO(updated);
    }
 
 
    private ProjetoDTO convertToDTO(Todo model) {
    	ProjetoDTO dto = new ProjetoDTO();
 
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
 
        return dto;
    }
}