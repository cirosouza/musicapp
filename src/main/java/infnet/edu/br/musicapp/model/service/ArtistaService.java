package infnet.edu.br.musicapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.br.musicapp.model.domain.Artista;
import infnet.edu.br.musicapp.model.repository.ArtistaRepository;

@Service
public class ArtistaService {

	@Autowired
	private ArtistaRepository artistaRepository;

	public Artista incluir(Artista artista) {
		return artistaRepository.save(artista);
	}

	public void excluir(Integer key) {
		artistaRepository.deleteById(key);
	}
	
	public List<Artista> obterLista() {
		return (List<Artista>) artistaRepository.findAll();
	}
	
	public Artista obterPorId(Integer id) {
		return artistaRepository.findById(id).orElse(null);
	}
	
	public Artista obterPorNome(String nome) {
		return artistaRepository.obterPorNome(nome);
	}
}
