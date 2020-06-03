package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 12/28/19.
 */
public class PetController {
    @Autowired
    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
