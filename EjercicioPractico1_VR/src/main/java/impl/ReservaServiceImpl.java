/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.service.impl;

import EjercicioPractico1_ValeriaRodriguez.demo.domain.Reserva;
import EjercicioPractico1_ValeriaRodriguez.demo.repository.ReservaRepository;
import EjercicioPractico1_ValeriaRodriguez.demo.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva obtenerReserva(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
