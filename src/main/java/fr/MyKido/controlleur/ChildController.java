package fr.MyKido.controlleur;

import fr.MyKido.dto.ChildDTO;
import fr.MyKido.models.ParentEntity;
import fr.MyKido.repository.UserRepository;
import fr.MyKido.service.ChildService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("api/child")
@CrossOrigin(origins = "*")
public class ChildController {
    private final ChildService childService;
    private final UserRepository userRepository;
    
    public ChildController(ChildService childService,UserRepository userRepository) {
        this.childService = childService;
        this.userRepository= userRepository;
    }

       // Ajouter un enfant (Le parent connecté l'ajoute)
    @PostMapping("/add")
    public ChildDTO addChild (@RequestBody ChildDTO childDTO, Authentication authentication) {
        ParentEntity parentEntity = (ParentEntity) userRepository.findByEmail(authentication.getName()).get();
        return childService.addChild(childDTO, parentEntity);
    }

    @GetMapping("/mychildren")
    public List<ChildDTO> getChildrenByParent(Authentication authentication) {
        ParentEntity parentEntity = (ParentEntity) userRepository.findByEmail(authentication.getName()).get();
        return childService.getChildrenByParent(parentEntity.getId());
    }
        @GetMapping("/childrens")
        public List<ChildDTO> getChildrens(Authentication authentication) {
            return childService.getChildrens();

}
}
