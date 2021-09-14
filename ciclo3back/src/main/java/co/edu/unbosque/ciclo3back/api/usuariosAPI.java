package co.edu.unbosque.ciclo3back.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.unbosque.ciclo3back.dao.usuariosDAO;
import co.edu.unbosque.ciclo3back.model.usuarios;

public class usuariosAPI {

	@Autowired
	private usuariosDAO usuarioDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody usuarios usuarios) {
		usuarioDAO.save(usuarios);	
	}
	@GetMapping("/listar")
	public List<usuarios> listar(){
		return usuarioDAO.findAll();
		
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		usuarioDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody usuarios usuarios) {
		usuarioDAO.save(usuarios);
	}
}
