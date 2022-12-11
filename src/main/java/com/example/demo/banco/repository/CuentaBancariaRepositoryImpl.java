package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository  {
	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//Mock
		CuentaBancaria cuenta = new CuentaBancaria();
		for (CuentaBancaria cb:baseCuentas) {
			if(cb.getNumero().equals(numeroCuenta)) {				
				cuenta = cb;
				System.out.println("Se busca la cuenta bancaria "+numeroCuenta);
			}
			
		}
		
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta: "+id);
		
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		//Update
		CuentaBancaria cuenta = null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(cuentaBancaria.getNumero())) {
				cuenta = cb;
			
			}
			
		}
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		System.out.println("Se actualiza la cuenta: "+cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta la cuenta bancaria: "+cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha borrado la cuenta"+id);
	}

	@Override
	public void realizar(String string, String string2, BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		
	}

}
