package edu.zut.cs.emotion.base.dao;

import java.io.Serializable;

import edu.zut.cs.emotion.base.domain.BaseTreeEntity;


public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
		extends GenericDaoTestCase<PK, T, M> {

}
