/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.service.impl;

import EjercicioPractico1_ValeriaRodriguez.demo.domain.Categoria;
import java.util.List;
/**
 *
 * @author rodri
 * Valeria Rodriguez Vargas 
 */
public interface CategoriaService {
    public List<Categoria> listarCategorias();

    public Categoria obtenerCategoria(Long id);

    public void guardarCategoria(Categoria categoria);

    public void eliminarCategoria(Long id);

}
