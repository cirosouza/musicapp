package infnet.edu.br.musicapp.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import infnet.edu.br.musicapp.model.domain.Artista;

public interface ArtistaRepository extends CrudRepository<Artista, Integer> {

	@Query("from Artista a where a.nome = :nome")
	public Artista obterPorNome(String nome);
}
