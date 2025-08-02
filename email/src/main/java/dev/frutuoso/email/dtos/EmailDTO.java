package dev.frutuoso.email.dtos;

import java.util.UUID;

public record EmailDTO(
        UUID id,
        String subject,
        String body
) {
}
