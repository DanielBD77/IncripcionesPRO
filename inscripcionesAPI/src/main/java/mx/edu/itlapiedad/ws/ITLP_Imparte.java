package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Docentes;
import mx.edu.itlapiedad.models.Imparte;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods={RequestMethod.GET})
public class ITLP_Imparte {
	@Autowired
	DAO repositorio;
	
	//
	@GetMapping("imparte/materia/{idAlumno}")
	public List<Imparte> consultaDocenteMateria(@PathVariable int idAlumno) {
		return repositorio.consultaDocenteMateria(idAlumno);
	}
}
