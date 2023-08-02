package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.DTO.PersonDTO;
import com.devsuperior.aula.DTO.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

		Person entity = new Person();

		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());
		department.setId(dto.getDepartment().getId());

		entity.setDepartment(department);

		entity = repository.save(entity);
		return new PersonDepartmentDTO(entity);

	}

	public PersonDTO insert(PersonDTO dto) {

		Person entity = new Person();

		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department department = departmentRepository.getReferenceById(dto.getDepartmentId());
		department.setId(dto.getDepartmentId());

		entity.setDepartment(department);

		entity = repository.save(entity);
		return new PersonDTO(entity);

	}

}
