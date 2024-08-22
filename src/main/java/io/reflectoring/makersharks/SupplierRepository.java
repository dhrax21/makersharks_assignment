package io.reflectoring.makersharks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    @Query("SELECT s FROM Supplier s WHERE (:location IS NULL OR s.location = :location) " +
            "AND (:natureOfBusiness IS NULL OR s.natureOfBusiness = :natureOfBusiness) " +
            "AND (:manufacturingProcesses IS NULL OR s.manufacturingProcesses LIKE %:manufacturingProcesses%)")
    List<Supplier> findSuppliersByCriteria(
            @Param("location") String location,
            @Param("natureOfBusiness") String natureOfBusiness,
            @Param("manufacturingProcesses") String manufacturingProcesses);
}

