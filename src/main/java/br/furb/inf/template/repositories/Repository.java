package br.furb.inf.template.repositories;

import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import br.furb.inf.template.utils.FilterImpl;
import br.furb.inf.template.utils.Page;


@org.springframework.stereotype.Repository
public interface Repository<T> {
	
	@Transactional(readOnly = true)
	public T retrieve(UUID id);
	
	@Transactional(readOnly = true)
	public Page<T> list(FilterImpl filter);
}
