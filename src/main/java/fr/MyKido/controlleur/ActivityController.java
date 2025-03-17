package fr.MyKido.controlleur;

import fr.MyKido.dto.ActivityDTO;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.repository.ChildRepository;
import fr.MyKido.service.ActivityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/activity")
@CrossOrigin(origins = "*")
public class ActivityController {
    private final ActivityService activityService;
    private final ChildRepository childRepository;

    public ActivityController(ActivityService activityService, ChildRepository childRepository) {
        this.activityService = activityService;
        this.childRepository = childRepository;
    }
    @PostMapping("/activity")
    public ActivityDTO arrival(@RequestBody ActivityDTO activityDTO) {
        ChildEntity childEntity = childRepository.findById(activityDTO.getChildId()).get();
        return activityService.addActivityArrival(activityDTO,childEntity);
        
    }

    @GetMapping("/{id}")
    public List<ActivityDTO> arrival(@PathVariable("id") Integer childId) {
        return activityService.getActivityByChildId(childId);
        
    }


}
