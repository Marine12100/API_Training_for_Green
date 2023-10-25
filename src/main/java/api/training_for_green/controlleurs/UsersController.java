package api.training_for_green.controlleurs;

import api.training_for_green.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API_TrainingForGreen")
public class UsersController {
    UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "/checkPassword")
    @ResponseBody
    public int verificationMotDePasseEtRecuperationIDGroupe(@RequestBody String s) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserSend user = mapper.readValue(s, UserSend.class);
        return userService.verificationMotDePasseEtRecuperationIDGroupe(user.getMail(), user.getMotDePasse());
    }
}
