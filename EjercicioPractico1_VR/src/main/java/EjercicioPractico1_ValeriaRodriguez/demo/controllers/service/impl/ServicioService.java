/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.service.impl;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Servicio;
import java.util.List;
/**
 *
 * @author rodri
 * Valeria Rodriguez Vargas 
 */
public interface ServicioService {
    
    public List<Servicio> listarServicios();

    public Servicio obtenerServicio(Long id);

    public void guardarServicio(Servicio servicio);

    public void eliminarServicio(Long id);
    
}
