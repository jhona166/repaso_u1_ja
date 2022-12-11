package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

                                         
import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {	
	public List<Transferencia> buscarReporte();
	public void realizar(String numeroOrigen, String numeroDestino,BigDecimal monto);
}
