package io.reflectoring.makersharks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SupplierSearchRequest {
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcesses;
    private int limit;
}
