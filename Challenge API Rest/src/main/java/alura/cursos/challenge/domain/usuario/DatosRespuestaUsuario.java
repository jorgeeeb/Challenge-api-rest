package alura.cursos.challenge.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRespuestaUsuario(
        @NotBlank Long id,
        @NotBlank String nombre,
        @NotBlank @Email String email
) {

}