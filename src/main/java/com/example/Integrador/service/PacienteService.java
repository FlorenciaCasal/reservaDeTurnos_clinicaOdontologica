package com.example.Integrador.service;


import com.example.Integrador.entity.Paciente;
import com.example.Integrador.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

   public Paciente guardarPaciente(Paciente paciente){
       return pacienteRepository.save(paciente);
   }
   public Optional<Paciente> buscarPacientePorID(Long id){
       return pacienteRepository.findById(id);
   }

   public void eliminarPaciente(Long id){
       pacienteRepository.deleteById(id);
   }

   public void actualizarPaciente(Paciente paciente){
       pacienteRepository.save(paciente);
   }

   public List<Paciente> devolverPacientes(){
       return pacienteRepository.findAll();
   }
   public Optional<Paciente> buscarPacientePorCorreo(String correo){
       return pacienteRepository.findByEmail(correo);
   }
}
