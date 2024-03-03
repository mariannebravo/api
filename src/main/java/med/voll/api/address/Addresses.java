package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Addresses {
  private String street;
  private String neighborhood;
  private String city;
  private String state;
  private String cep;
  private String additionalInformation;

  public Addresses(Address address) {
    this.street = address.street();
    this.neighborhood = address.neighborhood();
    this.city = address.city();
    this.state = address.state();
    this.cep = address.cep();
    this.additionalInformation = address.additionalInformation();
  }
}
