package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidade.Local;

public interface RepositorioLocal extends JpaRepository <Local, Long>{
	
}