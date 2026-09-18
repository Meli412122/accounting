package ar.edu.utn.frc.tup.piv.accounting.dto;

import java.time.Instant;
import java.util.Map;

public record ErrorApi(
        Instant timestamp,
        Integer status,
        String error,
        String message,
        String path,
        Map<String, String> validationErrors) {
}
