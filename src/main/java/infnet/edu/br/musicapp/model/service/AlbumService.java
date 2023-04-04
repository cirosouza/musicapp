package infnet.edu.br.musicapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.br.musicapp.model.domain.Album;
import infnet.edu.br.musicapp.model.repository.AlbumRepository;

@Service
public class AlbumService {

	@Autowired
	private AlbumRepository albumRepository;

	public Album incluir(Album album) {
		return albumRepository.save(album);
	}

	public void excluir(Integer key) {
		albumRepository.deleteById(key);
	}

	public List<Album> obterLista() {

		return (List<Album>) albumRepository.findAll();
	}

	public Album obterPorId(Integer id) {
		return albumRepository.findById(id).orElse(null);
	}

	public Album obterPorNome(String nome) {
		return albumRepository.obterPorNome(nome);
	}
}
