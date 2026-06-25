/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.controllers;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Servicio;
import EjercicioPractico1_ValeriaRodriguez.demo.service.CategoriaService;
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
public class ServicioController {
    @Autowired
    private ServicioService servicioService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/servicios")
    public String listarServicios(Model model) {
        model.addAttribute("servicios", servicioService.listarServicios());
        return "servicio/listado";
    }

    @GetMapping("/servicios/nuevo")
    public String nuevoServicio(Servicio servicio, Model model) {
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "servicio/formulario";
    }

    @PostMapping("/servicios/guardar")
    public String guardarServicio(Servicio servicio) {
        servicioService.guardarServicio(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/servicios/editar/{id}")
    public String editarServicio(Servicio servicio, Model model) {
        servicio = servicioService.obtenerServicio(servicio.getId());
        model.addAttribute("servicio", servicio);
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "servicio/formulario";
    }

    @GetMapping("/servicios/eliminar/{id}")
    public String eliminarServicio(Servicio servicio) {
        servicioService.eliminarServicio(servicio.getId());
        return "redirect:/servicios";
    }
}
