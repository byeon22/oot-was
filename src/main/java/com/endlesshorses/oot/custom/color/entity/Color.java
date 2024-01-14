package com.endlesshorses.oot.custom.color.entity;

import com.endlesshorses.oot.custom.result.entity.Result;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COLOR_ID")
	private Long id;
	@Column(unique = true, nullable = false)
	private String name;
	@Column(nullable = false)
	private Long red;
	@Column(nullable = false)
	private Long green;
	@Column(nullable = false)
	private Long blue;

	@OneToMany(mappedBy = "color") //읽기만 가능
	private List<Result> results = new ArrayList<>();
}
