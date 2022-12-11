package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	//Crud 
	public Transferencia buscar(Integer id);
	//Vamos a necesitar
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);
	public List<Transferencia> buscarTodos();
	
}
