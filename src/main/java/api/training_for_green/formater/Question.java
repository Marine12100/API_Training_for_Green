/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.training_for_green.formater;

import java.util.List;

/**
 *
 * @author ThomasAndres
 */
public class Question {
    public int id;
    public String question;
    public List<Reponse> reponses;

    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public Question() {
    }
    
    

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }
    
    
    
}
