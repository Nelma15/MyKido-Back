package fr.MyKido.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.MyKido.dto.ChildDTO;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.models.ParentEntity;
import fr.MyKido.repository.ChildRepository;
import fr.MyKido.mapper.ChildMapper;

@Service
public class ChildService {
    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    //  Récupérer les enfants d'un parent
    public List<ChildDTO> getEnfantsByParent(Integer parentId) {
        
        List<ChildEntity> children = childRepository.findByParentId(parentId);
        return ChildMapper.toDTOList(children);
    }
    public ChildDTO addChild(ChildDTO dto, ParentEntity parentEntity) {
        ChildEntity child = ChildMapper.toEntity(dto, parentEntity);
        child = childRepository.save(child);
        return ChildMapper.toDTO(child);
    }

    //  Supprimer un enfant
    public void deleteChild(Integer id) {
        childRepository.deleteById(id);
    }


}
