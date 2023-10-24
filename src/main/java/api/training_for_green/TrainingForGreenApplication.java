package api.training_for_green;

import api.training_for_green.formater.Question;
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
        
        
    @GetMapping("/getAllQuestion")
    public List<Question> getAllPresets(
    ){
        return this.manager.getAllQuestion();
    }
    
    @GetMapping("/getOneQuestion")
    public List<Question> getOneQuestion(
    ){
        return this.manager.getOneQuestion();
    }

    @GetMapping("/getOneQuestionAdmin")
    public List<Question> getOneQuestionAdmin(
    ){
        return this.manager.getOneQuestion();
    }
    
    @GetMapping("/getAllQuestionAdmin")
    public List<Question> getAllQuestionAdmin(
    ) throws SQLException{
        return this.manager.test();
    }
}
