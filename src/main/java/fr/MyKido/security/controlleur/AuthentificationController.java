package fr.MyKido.security.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.MyKido.security.dto.AuthResponseDTO;
import fr.MyKido.security.dto.LoginDTO;
import fr.MyKido.security.dto.RegisterDTO;
import fr.MyKido.security.jwt.JWTGenerator;
import fr.MyKido.security.models.AdminEntity;
import fr.MyKido.security.models.ChildEducatorEntity;
import fr.MyKido.security.models.ParentEntity;
import fr.MyKido.security.models.Role;
import fr.MyKido.security.models.UserEntity;
import fr.MyKido.security.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthentificationController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTGenerator jwtGenerator;
    private final AuthenticationManager authenticationManager;

    public AuthentificationController(UserRepository userRepository, PasswordEncoder passwordEncoder,
            JWTGenerator jwtGenerator, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDTO registerDto) {
        if (userRepository.existsByEmail(registerDto.getEmail())) {
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }
        if (registerDto.getRole() == Role.ROLE_ADMIN) {
            UserEntity user = new AdminEntity();
            user.setEmail(registerDto.getEmail());
            user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
            user.setFirstName(registerDto.getFirstName());
            user.setLastName(registerDto.getLastName());
            user.setPhone(registerDto.getPhone());
            user.setRole(registerDto.getRole());
            userRepository.save(user);

        } else if (registerDto.getRole() == Role.ROLE_CHILDEDUCATOR) {
            UserEntity user = new ChildEducatorEntity();
            user.setEmail(registerDto.getEmail());
            user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
            user.setFirstName(registerDto.getFirstName());
            user.setLastName(registerDto.getLastName());
            user.setPhone(registerDto.getPhone());
            user.setRole(registerDto.getRole());
            userRepository.save(user);
        } else {
            UserEntity user = new ParentEntity();
            user.setEmail(registerDto.getEmail());
            user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
            user.setFirstName(registerDto.getFirstName());
            user.setLastName(registerDto.getLastName());
            user.setPhone(registerDto.getPhone());
            user.setRole(registerDto.getRole());
            userRepository.save(user);
        }

        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginDTO loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);

        return new ResponseEntity<>(new AuthResponseDTO(token), HttpStatus.OK);
    }

}
