/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Categoria;
import EjercicioPractico1_ValeriaRodriguez.demo.repository.CategoriaRepository;
import EjercicioPractico1_ValeriaRodriguez.demo.service.impl.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author rodri
 * Valeria Rodriguez Vargas 
 */
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
    
}
