/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Servicio;
import EjercicioPractico1_ValeriaRodriguez.demo.repository.ServicioRepository;
import EjercicioPractico1_ValeriaRodriguez.demo.service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author rodri
 * Valeria Rodriguez Vargas 
 */
public class ServicioServiceImpl implements ServicioService {
@Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> listarServicios() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio obtenerServicio(Long id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarServicio(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void eliminarServicio(Long id) {
        servicioRepository.deleteById(id);
    }    
}
