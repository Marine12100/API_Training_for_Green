package api.training_for_green;

import api.training_for_green.formater.Question;
import api.training_for_green.formater.QuestionWithText;
import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrainingForGreenApplication {
    private MainManager manager = new MainManager();
    public static void main(String[] args) {
	SpringApplication.run(TrainingForGreenApplication.class, args);
    }
        
    
    @GetMapping("/getAllQuestionAdmin")
    public List<Question> getAllQuestionAdmin(
    ) throws SQLException{
        return this.manager.getAllQuestionAdmin();
    }
    
    @GetMapping("/getAllQuestion")
    public List<QuestionWithText> getAllQuestion(
    ) throws SQLException{
        return this.manager.getAllQuestion();
    }
}
