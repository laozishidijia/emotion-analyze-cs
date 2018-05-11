package edu.zut.cd.emotion.base.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cd.emotion.base.service.GenericManager;
import edu.zut.cs.emotion.base.dao.GenericDao;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Transactional
public class GenericManagerImpl<T extends BaseEntity, PK extends Serializable>
		implements GenericManager<T, PK> {

	protected GenericDao<T, PK> dao;

	public Page<T> findAll(Pageable page) {
		Page<T> result = this.dao.findAll(page);
		return result;
	}

	public T findById(PK id) {
		return this.dao.getOne(id);
	}

	public T save(T entity) {
		return this.dao.saveAndFlush(entity);
	}

	public List<T> save(Iterable<T> entities) {
		return this.dao.saveAll(entities);
	}

	public List<T> findAll() {
		return this.dao.findAll();
	}

	public void delete(PK id) {
		this.dao.deleteById(id);
	}

}
