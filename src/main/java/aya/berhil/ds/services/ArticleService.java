package aya.berhil.ds.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aya.berhil.ds.dao.IDao;
import aya.berhil.ds.entities.Article;
import aya.berhil.ds.entities.Categorie;
import aya.berhil.ds.repositories.ArticleRepository;




@Service
public class ArticleService implements IDao<Article>{

    @Autowired
    ArticleRepository articleRepository;
    @Override
    public Article create(Article o) {
       return articleRepository.save(o);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article update(Article o) {
        return articleRepository.save(o);
    }

    @Override
    public boolean delete(Article o) {
        try {
        	articleRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Article findById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
    
    public List<Article> findByCategorie(Categorie categorie) {
        return articleRepository.findByCategorie(categorie);
    }
  
    
    

}