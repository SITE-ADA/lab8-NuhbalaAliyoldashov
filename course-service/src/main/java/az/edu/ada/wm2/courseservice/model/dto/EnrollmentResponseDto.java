package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentResponseDto {

    @Schema(description = "Qeydiyyatın identifikatoru", example = "10")
    private Long enrollmentId;

    @Schema(description = "Kursun identifikatoru", example = "1")
    private Long courseId;

    @Schema(description = "Tələbənin identifikatoru", example = "15")
    private Long studentId;

    @Schema(description = "Qeydiyyat tarixi ISO formatında", example = "2026-05-20T14:25:30")
    private LocalDateTime enrollmentDate;

    @Schema(description = "Əməliyyatın nəticə mesajı", example = "Student enrolled successfully.")
    private String message;
}
