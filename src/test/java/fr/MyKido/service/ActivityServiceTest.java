package fr.MyKido.service;

import fr.MyKido.dto.ActivityDTO;
import fr.MyKido.mapper.ActivityMapper;
import fr.MyKido.models.Activity;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.repository.ActivityRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ActivityServiceTest {

    @Mock
    ActivityRepository activityRepository;
    @InjectMocks
    ActivityService activityService;

    @Test
    void addActivityArrival() {
        ChildEntity childEntity = new ChildEntity();
        childEntity.setId(1);
        childEntity.setLastName("Doe");
        childEntity.setFirstName("John");
        childEntity.setBirthDate("01/01/2021");
        childEntity.setAllergies("None");
        childEntity.setNotes("None");
        ActivityDTO activity = new ActivityDTO();
        activity.setChildId(childEntity.getId());
        activity.setActivityTimeStart(LocalDateTime.now());
        activity.setActivityTimeEnd(LocalDateTime.now().plusDays(1));
        activity.setActivityName("Arrival");
        activity.setActivityDescription("Arrival of the child");
        activity.setActivityType("Arrival");
        activity.setPhoto(null);
        Activity entity = ActivityMapper.toEntity(activity, childEntity);
        Mockito.when(activityRepository.save(any(Activity.class))).thenReturn(entity);
        activityService.addActivityArrival(activity, childEntity);
        verify(activityRepository, Mockito.times(1)).save(any(Activity.class));

    }



}