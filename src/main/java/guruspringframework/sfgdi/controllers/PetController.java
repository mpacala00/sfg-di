package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
