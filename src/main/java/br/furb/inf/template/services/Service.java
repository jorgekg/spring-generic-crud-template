package br.furb.inf.template.services;

import java.util.UUID;

import br.furb.inf.template.utils.FilterImpl;
import br.furb.inf.template.utils.Page;

public interface Service<T> {

	T create(T entity);

	T update(UUID id, T entity);

	T get(UUID id);

	Page<T> list(FilterImpl filter);

	T retrieve(UUID id);

	void delete(UUID id);

	void delete(T entity);

}
