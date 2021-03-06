package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.services.GreetingService;

@Controller // Anotacion para indicar que es un controlador y que se genere un bean para
			// tratarlo
public class SetterInjectedController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	/**
	 * @param greetingService the greetingService to set
	 */
	@Autowired // Anotacion para enlazar un bean durante el uso de esta clase.
	@Qualifier("setterGreetingService") // Anotacion para identificar qué servicio es inyectado
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
