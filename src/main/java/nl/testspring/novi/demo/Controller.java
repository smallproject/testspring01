package nl.testspring.novi.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/api/test/{resourceId}")
    public String getString(@PathVariable String resourceId) {
        return "Here is your resource: " + resourceId;
    }

    @PostMapping("/api/setProfile")
    public void receiveData(@RequestBody Profile profile) {
        System.out.println("Here is the received profile: " + profile);
    }

    class Profile {
        private String name;
        private String address;
        public Profile() {

        }
    }
}
