package fr.MyKido.controlleur;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Parent;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.MyKido.dto.ChildDTO;
import fr.MyKido.models.ParentEntity;
import fr.MyKido.models.UserEntity;
import fr.MyKido.repository.UserRepository;
import fr.MyKido.service.ChildService;



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

       // 🔹 Ajouter un enfant (Le parent connecté l'ajoute)
    @PostMapping("/add")
    public ChildDTO addChild (@RequestBody ChildDTO childDTO, Authentication authentication) {
        System.out.println("Utilisateur connecté : " + authentication.getName());
        ParentEntity parentEntity = (ParentEntity) userRepository.findByEmail(authentication.getName()).get();
        //Integer parentId = Integer.getInteger(user.getId());
        return childService.addChild(childDTO, parentEntity);
    }

    // 🔹 Supprimer un enfant (vérification du parent)
    //@DeleteMapping("/{id}")
    //public void deleteChild(@PathVariable Integer id, Authentication authentication) {
      //  Integer parentId = Integer.getInteger(authentication.getName());
        //List<ChildDTO> children = childService.getEnfantsByParent(parentId);
        //boolean existe = children.stream().anyMatch(e -> e.getId().equals(id));

        //if (!existe) {
          //  throw new RuntimeException("Vous ne pouvez pas supprimer cet enfant !");
       // }
        //childService.deleteChild(id);
   // }
    

}
