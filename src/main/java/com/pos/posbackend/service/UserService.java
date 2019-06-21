package com.pos.posbackend.service;

import java.util.List;

import com.pos.posbackend.model.User;

public interface UserService {

	/**
	 * Guarda un usuario
	 * 
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Elimina un usuario con el id recibido
	 * 
	 * @param id
	 */
	//void deleteUser(Long id);
	
	/**
	 * Recupera la contraseña de un usuario
	 */
	String recuperaPassword(String usuario);
	
	/**
	 * Autentica el usuario
	 * @param usuario
	 * @param password
	 * @return
	 */
	String autenticaUsuario(String usuario);

	
}
