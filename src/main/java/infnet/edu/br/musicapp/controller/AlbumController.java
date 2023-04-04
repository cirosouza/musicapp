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

import infnet.edu.br.musicapp.model.domain.Album;
import infnet.edu.br.musicapp.model.domain.Artista;
import infnet.edu.br.musicapp.model.service.AlbumService;
import infnet.edu.br.musicapp.model.service.ArtistaService;

@RestController
@RequestMapping("/albuns")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@PostMapping
	public void salvar(@RequestBody Album album) {

		albumService.incluir(album);
	}

	@PutMapping
	public void alterar(@RequestBody Album artista) {
		albumService.incluir(artista);
	}

	@DeleteMapping(path = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		albumService.excluir(id);
	}

	// GET: http://localhost:8080/albuns/1
	@GetMapping(path = "/{id}")
	public Album buscar(@PathVariable("id") Integer id) {
		return albumService.obterPorId(id);
	}

	// GET: http://localhost:8080/albuns?nome=ironmaiden
	@GetMapping
	public List<Album> listar() {

		return (List<Album>) albumService.obterLista();
	}

	@GetMapping(path = "/nome/{nome}")
	public Album buscar(@PathVariable("nome") String nome) {
		return albumService.obterPorNome(nome);
	}

}
