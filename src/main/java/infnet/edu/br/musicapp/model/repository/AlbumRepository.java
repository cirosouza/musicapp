package infnet.edu.br.musicapp.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import infnet.edu.br.musicapp.model.domain.Album;

public interface AlbumRepository  extends CrudRepository<Album, Integer> {

	@Query("from Album a where a.nome = :nome")
	public Album obterPorNome(String nome);
}
