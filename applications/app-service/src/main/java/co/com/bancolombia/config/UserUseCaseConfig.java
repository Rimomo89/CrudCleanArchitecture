package co.com.bancolombia.config;

import co.com.bancolombia.model.usermodel.gateways.UserModelRepository;
import co.com.bancolombia.usecase.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserUseCaseConfig {
    @Bean
    public UserUseCase userUseCase (UserModelRepository userModelRepository){
        return new UserUseCase(userModelRepository);
    }
}
