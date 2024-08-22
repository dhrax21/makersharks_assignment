package io.reflectoring.makersharks;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int limit, @NotNull(message = "Page size is required") int size) {
        List<Supplier> suppliers = supplierRepository.findSuppliersByCriteria(location, natureOfBusiness, manufacturingProcesses);
        return suppliers.stream().limit(limit).toList();
    }
}

