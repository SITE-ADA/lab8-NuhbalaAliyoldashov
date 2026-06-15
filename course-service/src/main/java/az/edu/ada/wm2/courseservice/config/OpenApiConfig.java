package az.edu.ada.wm2.courseservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Kurs Xidməti API",
                version = "v1",
                description = "Kursların idarəedilməsi üçün CRUD və qeydiyyat API-si.",
                contact = @Contact(name = "WM2 Backend Course"),
                license = @License(name = "Təhsil məqsədi ilə istifadə")
        ),
        servers = {
                @Server(url = "http://localhost:8081", description = "Yerli server")
        }
)
public class OpenApiConfig {
}
