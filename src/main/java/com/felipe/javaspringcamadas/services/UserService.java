package com.felipe.javaspringcamadas.services;

import com.felipe.javaspringcamadas.dto.UserDTO;
import com.felipe.javaspringcamadas.entities.User;
import com.felipe.javaspringcamadas.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    // Injetando uma dependência
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        // findById retorna um objeto optional do Java, pra que eu possa acessar o objeto que está dentro do optional tenho que chamar o get()
        User entity = userRepository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
     
}
