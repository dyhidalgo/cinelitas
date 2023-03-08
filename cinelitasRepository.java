/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.repository;
import com.cinelitas.entity.cinelitas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Diker Hidalgo
 */

@Repository
public interface cinelitasRepository extends CrudRepository<cinelitas, Long>{
    
    
}
