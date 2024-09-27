package com.curso.services;

import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {
    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

        Paciente paciente01 = new Paciente(0, "Pedro", LocalDate.now(), new BigDecimal("2725.00"));
        Paciente paciente02 = new Paciente(0, "Alberto", LocalDate.now(), new BigDecimal("980.00"));
        Paciente paciente03 = new Paciente(0, "Cezar", LocalDate.now(), new BigDecimal("980.00"));

        Medico medico01 = new Medico(0, "Albert", LocalDate.now(), new BigDecimal("5000.00"));
        Medico medico02 = new Medico(0, "Eduardo", LocalDate.now(), new BigDecimal("9580.00"));
        Medico medico03 = new Medico(0, "Matis", LocalDate.now(), new BigDecimal("6754.00"));

        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        pacienteRepo.save(paciente03);

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);

    }

}
