package aya.berhil.ds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aya.berhil.ds.entities.Categorie;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
