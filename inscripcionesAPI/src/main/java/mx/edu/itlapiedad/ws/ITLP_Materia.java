package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Materias;

@RestController
@RequestMapping("/tec")
public class ITLP_Materia {
	@Autowired
	DAO repositorio;
	
	@GetMapping("materias/{idmaterias}")
	public Materias buscarMaterias(@PathVariable int idmaterias) {
		return repositorio.buscarMaterias(idmaterias);
	}
	@GetMapping("materias/carrera/{idcarrera}") 
	public List<Materias> buscarMateriasCarrera(@PathVariable int idcarrera) {
		return repositorio.buscarMateriaCarrera(idcarrera);
	}
}