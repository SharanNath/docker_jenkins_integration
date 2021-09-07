package simplilearnproject3.docker_jenkins_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
		System.out.println("This is an extention of a program command");
		System.out.println("Another extension");
	}

}
