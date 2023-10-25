package api.training_for_green;

import dao.Training_for_Green.repositories.UsersRepository;
import api.training_for_green.formater.Question;
import api.training_for_green.formater.QuestionWithText;
import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= UsersRepository.class)
@EntityScan("dao.Training_for_Green.dto")
@RestController
public class TrainingForGreenApplication {
    private MainManager manager = new MainManager();
    public static void main(String[] args) {
	SpringApplication.run(TrainingForGreenApplication.class, args);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getAllQuestionAdmin")
    public List<Question> getAllQuestionAdmin(
    ) throws SQLException{
        return this.manager.getAllQuestionAdmin();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getAllQuestion")
    public List<QuestionWithText> getAllQuestion(
    ) throws SQLException{
        return this.manager.getAllQuestion();
    }
}
