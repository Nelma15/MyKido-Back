package fr.MyKido.security.service;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import fr.MyKido.security.models.UserEntity;
import fr.MyKido.security.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        UserEntity user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
                
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().name());
        return new User(user.getEmail(), user.getPassword(), List.of(authority));
    }
       
    
    // private Collection<GrantedAuthority> mapRolesToAuthorities(List<Role> roles) {
    // return roles.stream()
    //         .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    // }

}
