package at.upstream_mobility.itacademy.bored;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class BoredCommands {
	
	private final BoredApiClient boredApiClient;
	
	@Autowired
    	public BoredCommands(BoredApiClient boredApiClient) {
	        this.boredApiClient = boredApiClient;
	    }

    @ShellMethod("Says hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @ShellMethod("Gets an activity")
    public String get(@ShellOption(defaultValue = "", arity = 1) String type) {
        BoredActivity activity = boredApiClient.getActivity(type);
        return activity.getActivity();
    }
}