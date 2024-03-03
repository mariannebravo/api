package med.voll.api.doctor;

import med.voll.api.address.Address;

public record Doctors(
    String name,
    String email,
    String crm,
    Area area,
    Address address
) {
}
