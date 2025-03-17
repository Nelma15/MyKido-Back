package fr.MyKido.service;

import fr.MyKido.dto.ChildDTO;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.models.ParentEntity;
import fr.MyKido.repository.ChildRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ChildServiceTest {

    @Mock
    ChildRepository childRepository;
    @InjectMocks
    ChildService childService;

    @Test
    void getChildrenByParent() {
        ParentEntity parent = new ParentEntity();
        parent.setId(1);
        parent.setLastName("Doe");
        parent.setFirstName("Toto");
        parent.setEmail("toto.doe@gmail.com");

        ChildEntity childEntity = new ChildEntity();
        childEntity.setId(1);
        childEntity.setLastName("Doe");
        childEntity.setFirstName("John");
        childEntity.setBirthDate("01/01/2021");
        childEntity.setAllergies("None");
        childEntity.setNotes("None");
        childEntity.setParent(parent);

        Mockito.when(childRepository.findByParentId(1)).thenReturn(List.of(childEntity));

        List<ChildDTO> children = childService.getChildrenByParent(1);
        assertEquals(1, children.size());
    }

    @Test
    void getChildrens(){

            ParentEntity parent = new ParentEntity();
            parent.setId(1);
            parent.setLastName("Doe");
            parent.setFirstName("Toto");
            parent.setEmail("toto.doe@gmail.com");

            ChildEntity childEntity = new ChildEntity();
            childEntity.setId(1);
            childEntity.setLastName("Doe");
            childEntity.setFirstName("John");
            childEntity.setBirthDate("01/01/2021");
            childEntity.setAllergies("None");
            childEntity.setNotes("None");
            childEntity.setParent(parent);

            ChildEntity childEntity1 = new ChildEntity();
            childEntity.setId(1);
            childEntity.setLastName("Doe");
            childEntity.setFirstName("Joe");
            childEntity.setBirthDate("01/01/2021");
            childEntity.setAllergies("None");
            childEntity.setNotes("None");
            childEntity.setParent(parent);

            ParentEntity parent1 = new ParentEntity();
            parent.setId(1);
            parent.setLastName("Windrunner");
            parent.setFirstName("Tata");
            parent.setEmail("tata.doe@gmail.com");

            ChildEntity childEntity2 = new ChildEntity();
            childEntity.setId(1);
            childEntity.setLastName("Windrunner");
            childEntity.setFirstName("Alléria");
            childEntity.setBirthDate("01/01/2021");
            childEntity.setAllergies("None");
            childEntity.setNotes("None");
            childEntity.setParent(parent);

            ChildEntity childEntity3= new ChildEntity();
            childEntity.setId(1);
            childEntity.setLastName("Windrunner");
            childEntity.setFirstName("Sylvanas");
            childEntity.setBirthDate("01/01/2021");
            childEntity.setAllergies("None");
            childEntity.setNotes("None");
            childEntity.setParent(parent);


            Mockito.when(childRepository.findAll()).thenReturn(List.of(childEntity,childEntity1,childEntity2,childEntity3));
            List<ChildDTO> childrens = childService.getChildrens();
            assertEquals(4, childrens.size());
        }
    }
