package uz.pdp.platformtask21.payload.receive;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CompanyDto {

    @NotNull(message = "corpName field is empty")
    private String corpName;

    @NotNull(message = "directorName field is empty")
    private String directorName;

    @NotNull(message = "street field is empty")
    private String street;

    private Integer homeNumber;

}
