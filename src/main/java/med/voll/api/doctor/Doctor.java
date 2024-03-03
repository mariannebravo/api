package med.voll.api.doctor;

import med.voll.api.address.Addresses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Table(name = "doctors")
@Entity(name = "Doctor")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String email;
   private String crm;

   @Enumerated(EnumType.STRING)
   private Area area;

   @Embedded
   private Addresses address;


  public Doctor(Doctors data) {
    this.name = data.name();
    this.email = data.email();
    this.crm = data.crm();
    this.area = data.area();
    this.address = new Addresses(data.address());
  }
}
