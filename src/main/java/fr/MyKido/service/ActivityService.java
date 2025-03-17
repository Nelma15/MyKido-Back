package fr.MyKido.service;

import fr.MyKido.dto.ActivityDTO;
import fr.MyKido.mapper.ActivityMapper;
import fr.MyKido.models.Activity;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {
        private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }
        
    public ActivityDTO addActivityArrival(ActivityDTO dto,ChildEntity child) {
        Activity activityArrival = ActivityMapper.toEntity(dto, child);
        activityArrival = activityRepository.save(activityArrival);
        return ActivityMapper.toDTO(activityArrival);
    }

    public List<ActivityDTO> getActivityByChildId(Integer childId) {
        List<Activity> activityArrival = activityRepository.findByChildId(childId);
        List<ActivityDTO> activityDTO = new ArrayList<>();
        for (Activity activity : activityArrival) {
            activityDTO.add(ActivityMapper.toDTO(activity));
        }
        return activityDTO;
    }

    

}
