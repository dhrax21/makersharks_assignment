package io.reflectoring.makersharks;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SupplierSearchRequest {

    @NotBlank(message = "Location is required")
    private String location;

    @NotBlank(message = "Nature of Business is required")
    private String natureOfBusiness;

    @NotBlank(message = "Manufacturing Processes are required")
    private String manufacturingProcesses;

    @NotNull(message = "Page number is required")
    private int page = 0;

    @NotNull(message = "Page size is required")
    private int size = 10;
}
