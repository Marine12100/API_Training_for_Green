/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.training_for_green;

import api.training_for_green.formater.Question;
import api.training_for_green.formater.Reponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThomasAndres
 */
public class MainManager {

    List<Question> getAllQuestion() {
        return null;
    }

    List<Question> getOneQuestion() {
        List<Question> questionList = new ArrayList<>();
        Reponse a = new Reponse(1,"Reponse A", false);
        Reponse b = new Reponse(2,"Reponse B", false);
        Reponse c = new Reponse(3,"Reponse C", true);
        Reponse d = new Reponse(4,"Reponse D", false);
        List<Reponse> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Question q = new Question(1, "Quel est la bonne réponse ?");
        q.setReponses(list);
        questionList.add(q);
        return questionList;
    }
    
}
