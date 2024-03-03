package med.voll.api.address;

public record Address(
    String street,
    String neighborhood,
    String city,
    String state,
    String cep,
    String additionalInformation
) {
}
