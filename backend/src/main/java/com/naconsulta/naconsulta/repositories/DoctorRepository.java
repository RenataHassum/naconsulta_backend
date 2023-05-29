package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
//    @Query("SELECT obj FROM Doctor obj " +
//            "WHERE UPPER(obj.firstName) LIKE UPPER(CONCAT('%', :name, '%')) UPPER(CONCAT('%', :last, '%')) ")
//    List<Doctor> searchByName(String name, String last);

    @Query("SELECT obj FROM Doctor obj " +
            "WHERE UPPER(obj.firstName) LIKE UPPER(CONCAT('%', :name, '%')) ")
    List<Doctor> searchByName(String name);

}
