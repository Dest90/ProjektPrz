package pl.edu.wat.wcy.prz.projektv01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class ProjektV01Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ProjektV01Application.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProjektV01Application.class);
    }

}
