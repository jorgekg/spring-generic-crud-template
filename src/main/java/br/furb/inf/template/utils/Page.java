package br.furb.inf.template.utils;

import lombok.NoArgsConstructor;

import java.util.List;

import lombok.AllArgsConstructor;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> {

	private List<T> conteudo;
	private Long totalElementos;
	private Long totalPaginas; 
	
}
