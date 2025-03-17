package fr.MyKido.service;

import fr.MyKido.dto.ChildDTO;
import fr.MyKido.mapper.ChildMapper;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.models.ParentEntity;
import fr.MyKido.repository.ChildRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {
    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    //  Récupérer les enfants d'un parent
    public List<ChildDTO> getChildrenByParent(Integer parentId) {
        
        List<ChildEntity> children = childRepository.findByParentId(parentId);
        return ChildMapper.toDTOList(children);
    }

    public ChildDTO addChild(ChildDTO dto, ParentEntity parentEntity) {
        ChildEntity child = ChildMapper.toEntity(dto, parentEntity);
        child = childRepository.save(child);
        return ChildMapper.toDTO(child);
    }


    public List<ChildDTO> getChildrens() {
        List<ChildEntity> children = childRepository.findAll();
        return ChildMapper.toDTOList(children);
    }

   


}
