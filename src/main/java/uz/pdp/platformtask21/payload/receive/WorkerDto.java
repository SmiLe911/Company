package uz.pdp.platformtask21.payload.receive;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WorkerDto {

    @NotNull(message = "name field is empty")
    private String name;

    @NotNull(message = "phoneNumber field is empty")
    private String phoneNumber;

    @NotNull(message = "street field is empty")
    private String street;

    @NotNull(message = "homeNumber field is empty")
    private Integer homeNumber;

    @NotNull(message = "departmentId field is empty")
    private Long departmentId;
}
