package com.devsuperior.aula.DTO;

public class PersonDTO {
	
	private Long id;
	private String name;
	private Double salary;
	
	private Long departmentId;

	public PersonDTO(Long id, String name, Double salary, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}

}
