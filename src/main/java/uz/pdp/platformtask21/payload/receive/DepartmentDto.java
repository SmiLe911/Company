package uz.pdp.platformtask21.payload.receive;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DepartmentDto {

    @NotNull(message = "name field is empty")
    private String name;

    @NotNull(message = "companyId field is empty")
    private Long companyId;
}
