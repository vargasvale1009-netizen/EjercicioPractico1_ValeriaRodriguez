/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.controllers;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Categoria;
import EjercicioPractico1_ValeriaRodriguez.demo.service.CategoriaService;
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
public class CategoriaController {
      @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categorias")
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "categoria/listado";
    }

    @GetMapping("/categorias/nuevo")
    public String nuevaCategoria(Categoria categoria) {
        return "categoria/formulario";
    }

    @PostMapping("/categorias/guardar")
    public String guardarCategoria(Categoria categoria) {
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/categorias/editar/{id}")
    public String editarCategoria(Categoria categoria, Model model) {
        categoria = categoriaService.obtenerCategoria(categoria.getId());
        model.addAttribute("categoria", categoria);
        return "categoria/formulario";
    }

    @GetMapping("/categorias/eliminar/{id}")
    public String eliminarCategoria(Categoria categoria) {
        categoriaService.eliminarCategoria(categoria.getId());
        return "redirect:/categorias";
    }
  
}
