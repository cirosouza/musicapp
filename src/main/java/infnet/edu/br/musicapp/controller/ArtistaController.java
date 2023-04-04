package infnet.edu.br.musicapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import infnet.edu.br.musicapp.model.domain.Artista;
import infnet.edu.br.musicapp.model.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

	@Autowired
	private ArtistaService artistaService;

	@PostMapping
	public void salvar(@RequestBody Artista artista) {

		artistaService.incluir(artista);
	}

	@PutMapping
	public void alterar(@RequestBody Artista artista) {
		artistaService.incluir(artista);
	}

	@DeleteMapping(path = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		artistaService.excluir(id);
	}

	@GetMapping(path = "/{id}")
	public Artista buscar(@PathVariable("id") Integer id) {
		return artistaService.obterPorId(id);
	}

	@GetMapping
	public List<Artista> listar() {
		return (List<Artista>) artistaService.obterLista();
	}

	@GetMapping(path = "/nome/{nome}")
	public Artista buscar(@PathVariable("nome") String nome) {
		return artistaService.obterPorNome(nome);
	}

}
