package softuni.exam.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "countries")
public class Country extends BaseEntity {

    @Min(value = 2)
    @Max(value = 60)
    @Column(unique = true, nullable = false)
    private String countryName;

    @Min(value = 2)
    @Max(value = 20)
    @Column(nullable = false)
    private String currency;

}
