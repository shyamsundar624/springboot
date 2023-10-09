package com.shyam.test.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ElementCollection
	@CollectionTable(name="list_tab", joinColumns = @JoinColumn(name="fk"))
	@OrderColumn(name="order_col")
	@Column(name="data")
	private List<String> listData;
	@ElementCollection
	@CollectionTable(name="set_tab", joinColumns = @JoinColumn(name="fk"))
	private Set<String> setData;
	@ElementCollection
	@CollectionTable(name="map_tab", joinColumns = @JoinColumn(name="fk"))
	@MapKeyColumn(name="map_key")
	private Map<String,String> mapData;
}
