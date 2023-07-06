package at.upstream_mobility.itacademy.bored;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

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
    public String get() {
        BoredActivity activity = boredApiClient.getActivity();
        return activity.getActivity();
    }
}