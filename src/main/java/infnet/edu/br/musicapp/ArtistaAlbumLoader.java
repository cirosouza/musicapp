package infnet.edu.br.musicapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import infnet.edu.br.musicapp.model.domain.Album;
import infnet.edu.br.musicapp.model.domain.Artista;
import infnet.edu.br.musicapp.model.service.AlbumService;
import infnet.edu.br.musicapp.model.service.ArtistaService;

@Order(1)
@Component
public class ArtistaAlbumLoader implements ApplicationRunner {

	@Autowired
	private ArtistaService artistaService;
	
	@Autowired
	private AlbumService albumService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Artista artista1 = new Artista();

		artista1.setNome("Iron Maiden");
		artista1.setAnoDeOrigem(1975);
		artista1.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/ironmaiden.jpg");

		Artista artista2 = new Artista();

		artista2.setNome("Coheed and Cambria");
		artista2.setAnoDeOrigem(1995);
		artista2.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/coheed.jpg");

		Artista artista3 = new Artista();

		artista3.setNome("Camel");
		artista3.setAnoDeOrigem(1971);
		artista3.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/camel.jpg");
		
		artistaService.incluir(artista1);
		artistaService.incluir(artista2);
		artistaService.incluir(artista3);
		
		Album album1 = new Album();
		album1.setNome("Powerslave");
		album1.setAnoDeGravacao(1984);
		album1.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/powerslave.jpg");
		album1.setArtista(artistaService.obterPorId(1));
		
		Album album2 = new Album();
		album2.setNome("Brave New World");
		album2.setAnoDeGravacao(2000);
		album2.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/brave.jpg");
		album2.setArtista(artistaService.obterPorId(1));
		
		Album album3 = new Album();
		album3.setNome("In Keeping Secrets of Silent Earth: 3");
		album3.setAnoDeGravacao(2003);
		album3.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/keeping.jpg");
		album3.setArtista(artistaService.obterPorId(2));
		
		Album album4 = new Album();
		album4.setNome("Year of the Black Rainbow");
		album4.setAnoDeGravacao(2010);
		album4.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/blackrainbow.jpg");
		album4.setArtista(artistaService.obterPorId(2));
		
		Album album5 = new Album();
		album5.setNome("Mirage");
		album5.setAnoDeGravacao(1974);
		album5.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/mirage.jpg");
		album5.setArtista(artistaService.obterPorId(3));
		
		Album album6 = new Album();
		album6.setNome("Moonmadness");
		album6.setAnoDeGravacao(1976);
		album6.setImg("https://mybucketartistas.s3.us-east-2.amazonaws.com/moonmadness.jpg");
		album6.setArtista(artistaService.obterPorId(3));
		
		albumService.incluir(album1);
		albumService.incluir(album2);
		albumService.incluir(album3);
		albumService.incluir(album4);
		albumService.incluir(album5);
		albumService.incluir(album6);
		
	}

}
