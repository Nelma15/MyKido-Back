package fr.MyKido.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import fr.MyKido.security.jwt.JWTAuthotificationFilter;


@Configuration // indique a spring que c une classe de configuration
@EnableWebSecurity // active la sécurité Web

public class SecurityConfig {

    

    @Bean // ici on configure les accés au ressources (api)
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable()) // desactive la protection CSRF
                .authorizeHttpRequests(
                        authz -> authz
                        
                       
                        .requestMatchers(HttpMethod.POST, "/api/auth/login").permitAll()
                        // .requestMatchers(HttpMethod.POST, "/api/auth/register").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/auth/**").hasAuthority("ROLE_ADMIN")
                        
                                
                                .anyRequest().authenticated() 
                                                              
                                                      

                );// autorise toutes les requetes
        
        http.addFilterBefore(jwtAuthenticationFilter(),UsernamePasswordAuthenticationFilter.class);

        return http.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public JWTAuthotificationFilter jwtAuthenticationFilter() {
        return new JWTAuthotificationFilter();

    }
        @Bean // configuration de l' AuthenticationManager
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }




}
