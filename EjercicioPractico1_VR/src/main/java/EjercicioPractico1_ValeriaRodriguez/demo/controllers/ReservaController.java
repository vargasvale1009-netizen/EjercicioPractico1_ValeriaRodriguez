/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.controllers;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Reserva;
import EjercicioPractico1_ValeriaRodriguez.demo.service.ReservaService;
import EjercicioPractico1_ValeriaRodriguez.demo.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
/**
 *
 * @author rodri
 */
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/reservas")
    public String listarReservas(Model model) {
        model.addAttribute("reservas", reservaService.listarReservas());
        return "reserva/listado";
    }

    @GetMapping("/reservas/nuevo")
    public String nuevaReserva(Reserva reserva, Model model) {
        model.addAttribute("servicios", servicioService.listarServicios());
        return "reserva/formulario";
    }

    @PostMapping("/reservas/guardar")
    public String guardarReserva(Reserva reserva) {
        reservaService.guardarReserva(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/reservas/editar/{id}")
    public String editarReserva(Reserva reserva, Model model) {
        reserva = reservaService.obtenerReserva(reserva.getId());
        model.addAttribute("reserva", reserva);
        model.addAttribute("servicios", servicioService.listarServicios());
        return "reserva/formulario";
    }

    @GetMapping("/reservas/eliminar/{id}")
    public String eliminarReserva(Reserva reserva) {
        reservaService.eliminarReserva(reserva.getId());
        return "redirect:/reservas";
    }
}
