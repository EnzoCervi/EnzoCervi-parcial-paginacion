package com.utn.utnApiRest;

import com.utn.utnApiRest.entities.*;
import com.utn.utnApiRest.repositories.AutorRepository;
import com.utn.utnApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeraApiRestApplication {
	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(PrimeraApiRestApplication.class, args);
		System.out.println("Api funcionando correctamentegit");
	}
/*
Con fines prácticos se realiza un hard coding de localidad, domicilio, autor, libro y persona para verificar
el correcto mapeo de relaciones
	@Bean
	CommandLineRunner init() {
		return args -> {

			Localidad localidad = Localidad.builder()
					.denominacion("Godoy Cruz")
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("Joaquin V. Gonzalez")
					.numero(863)
					.localidad(localidad)
					.build();

			Autor autor1 = Autor.builder()
					.nombre("James")
					.apellido("Clear")
					.biografia("Estudió Biomecánica en Denison")
					.build();


			Libro libro1= Libro.builder()
					.titulo("Habitos atomicos")
					.fecha(2020)
					.genero("autoayuda")
					.paginas(336)
					.build();


			Persona persona1 = Persona.builder()
					.nombre("Juan")
					.apellido("Lopez")
					.dni(44438881)
					.domicilio(domicilio)
					.build();

			libro1.AddAutores(autor1);


			persona1.AddLibros(libro1);

			personaRepository.save(persona1);


		};
	}

*/
}
