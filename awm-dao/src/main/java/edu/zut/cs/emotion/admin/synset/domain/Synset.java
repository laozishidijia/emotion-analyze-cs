package edu.zut.cs.emotion.admin.synset.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_SYNSET")
@Entity
public class Synset extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="SYNSET_ENTITY_NAME")
	String entity_name;
	
	@Column(name="SYNSET_NAME")
	String synset_name;
	
	@Column(name="ENTITY_IDX_START")
	int entity_idx_start;
	
	@Column(name="ENTITY_IDX_END")
	int entity_idx_end;
	
	@Column(name="SYNSET_DEFNITION")
	String synset_definition;
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	Region synset_region;

	public String getSynset_definition() {
		return synset_definition;
	}

	public void setSynset_definition(String synset_definition) {
		this.synset_definition = synset_definition;
	}

	public Region getSynset_region() {
		return synset_region;
	}

	public void setSynset_region(Region synset_region) {
		this.synset_region = synset_region;
	}

	public String getEntity_name() {
		return entity_name;
	}

	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
	}

	public String getSynset_name() {
		return synset_name;
	}

	public void setSynset_name(String synset_name) {
		this.synset_name = synset_name;
	}

	public int getEntity_idx_start() {
		return entity_idx_start;
	}

	public void setEntity_idx_start(int entity_idx_start) {
		this.entity_idx_start = entity_idx_start;
	}

	public int getEntity_idx_end() {
		return entity_idx_end;
	}

	public void setEntity_idx_end(int entity_idx_end) {
		this.entity_idx_end = entity_idx_end;
	}
	
	
}
