/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_ValeriaRodriguez.demo.repository;
import EjercicioPractico1_ValeriaRodriguez.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodri
 * Valeria Rodriguez Vargas 
 */

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
