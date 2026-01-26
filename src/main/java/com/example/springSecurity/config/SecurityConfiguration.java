package com.example.springSecurity.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        // 1. CSRF DISABLE
        // SAME SITE STRICT
        // 2. Functional interface and lambda expression
        // return http.csrf(customizer -> customizer.disable())
        return
        // http.csrf(Customizer.withDefaults())
        http.csrf(Customizer -> Customizer.disable())
            // .authorizeHttpRequests(request-> request.anyRequest().authenticated())
            .authorizeHttpRequests(request-> request
            .requestMatchers("/user/**").hasAnyRole("ADMIN","USER")
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .requestMatchers("/public/**").permitAll()
            .anyRequest().authenticated())
            // .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            // .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED))
            .sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .build();
    }



    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        // provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // no hash use this is plain text
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        provider.setUserDetailsService(userDetailsService);
            return provider;
        
    }


    //NOt using db this is hardcore

    // @Bean
    // public UserDetailsService userDetailsService() {

    //     List<UserDetails> users = new ArrayList<>();
        
    //     UserDetails user1 = User
    //         .withDefaultPasswordEncoder()
    //         .username("subbu1")
    //         .password("123")
    //         .roles("USER")
    //         .build();

    //     UserDetails admin = User
    //         .withDefaultPasswordEncoder()
    //         .username("admin")
    //         .password("admin123")
    //         .roles("ADMIN")
    //         .build();

    //         UserDetails Tl = User
    //             .withDefaultPasswordEncoder()
    //             .username("tl")
    //             .password("121")
    //             .roles("TL")
    //             .build();

    //             users.add(user1);
    //             users.add(admin);
    //             users.add(Tl);
    //             return new InMemoryUserDetailsManager(users);

    //     // return new InMemoryUserDetailsManager(user1, admin,Tl); //vargs
    // }

}
