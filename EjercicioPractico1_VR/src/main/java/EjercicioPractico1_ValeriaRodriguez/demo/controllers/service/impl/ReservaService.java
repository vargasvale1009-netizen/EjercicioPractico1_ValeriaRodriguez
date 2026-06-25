/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.service.impl;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Reserva;
import java.util.List;
/**
 *
 * @author rodri
 */
public interface ReservaService {
    
    public List<Reserva> listarReservas();

    public Reserva obtenerReserva(Long id);

    public void guardarReserva(Reserva reserva);

    public void eliminarReserva(Long id);
    
    
    
}
