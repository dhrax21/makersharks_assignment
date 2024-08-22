package io.reflectoring.makersharks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public List<Supplier> searchSuppliers(@RequestBody SupplierSearchRequest searchRequest) {
        return supplierService.searchSuppliers(
                searchRequest.getLocation(),
                searchRequest.getNatureOfBusiness(),
                searchRequest.getManufacturingProcesses(),
                searchRequest.getLimit()
        );
    }
}

