package aya.berhil.ds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aya.berhil.ds.entities.Article;
import aya.berhil.ds.entities.Categorie;

import java.util.Date;
import java.util.List;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
	
  List<Article> findByCategorie(Categorie categorie);

}
