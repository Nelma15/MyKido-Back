package fr.MyKido.mapper;

import java.util.List;
import java.util.stream.Collectors;
import fr.MyKido.dto.ActivityDTO;
import fr.MyKido.models.Activity;
import fr.MyKido.models.ChildEntity;

public class ActivityMapper {
    public static ActivityDTO toDTO(Activity activity) {
        return new ActivityDTO(
            activity.getActivityTimeStart(),
            activity.getActivityTimeEnd(),
            activity.getActivityName(),
            activity.getActivityDescription(),
            activity.getActivityType(),
            activity.getPhoto(),
            activity.getChild().getId()
            
        );
    }
        public static List<ActivityDTO> toDTOList(List<Activity> reports) {
        return reports.stream().map(ActivityMapper::toDTO).collect(Collectors.toList());
    }

    public static Activity toEntity(ActivityDTO dto,ChildEntity child) {
        Activity activity = new Activity();
        activity.setActivityTimeStart(dto.getActivityTimeStart());
        activity.setActivityTimeEnd(dto.getActivityTimeEnd());
        activity.setActivityName(dto.getActivityName());
        activity.setActivityDescription(dto.getActivityDescription());
        activity.setActivityType(dto.getActivityType());
        activity.setPhoto(dto.getPhoto());
        activity.setChild(child);
        return activity;
    }

}
